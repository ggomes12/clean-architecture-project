package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.TransferGateway;
import com.br.guilhermegomes.core.domain.Transaction;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.core.exception.InternalServerErrorException;
import com.br.guilhermegomes.core.exception.NotFoundException;
import com.br.guilhermegomes.core.exception.NotificateException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.*;

import java.math.BigDecimal;

public class TransferUseCaseImpl implements TransferUseCase {
    private FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase;
    private TransactionValidateUseCase transactionValidateUseCase;
    private CreateTransactionUseCase createTransactionUseCase;
    private TransferGateway transferGateway;
    private UserNotificationUseCase userNotificationUseCase;

    public TransferUseCaseImpl(FindWalletByTaxNumberUseCase findWalletByTaxNumberUseCase, TransactionValidateUseCase transactionValidateUseCase, CreateTransactionUseCase createTransactionUseCase, Transaction transaction, TransferGateway transferGateway, UserNotificationUseCase userNotificationUseCase) {
        this.findWalletByTaxNumberUseCase = findWalletByTaxNumberUseCase;
        this.transactionValidateUseCase = transactionValidateUseCase;
        this.createTransactionUseCase = createTransactionUseCase;
        this.transferGateway = transferGateway;
        this.userNotificationUseCase = userNotificationUseCase;
    }

    @Override
    public Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal value) throws InternalServerErrorException, Exception {
        Wallet fromWallet = findWalletByTaxNumberUseCase.findByTaxNumber(fromTaxNumber);
        Wallet toWallet = findWalletByTaxNumberUseCase.findByTaxNumber(toTaxNumber);

        fromWallet.transfer(value);
        toWallet.receiveTransfer(value);

        var transaction = createTransactionUseCase.create(new Transaction(fromWallet, toWallet, value));

        transactionValidateUseCase.validate(transaction);

        if(!transferGateway.transfer(transaction)) {
            throw new InternalServerErrorException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
        }

        if(!userNotificationUseCase.notificate(transaction, toWallet.getUser().getEmain())) {
            throw new NotFoundException(ErrorCodeEnum.TR0001.getMessage(), ErrorCodeEnum.TR0002.getCode());
        }

        return true;
    }
}
