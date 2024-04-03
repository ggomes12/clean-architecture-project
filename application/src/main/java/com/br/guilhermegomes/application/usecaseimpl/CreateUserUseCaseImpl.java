package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.CreateUserGateway;
import com.br.guilhermegomes.core.domain.TransactionPin;
import com.br.guilhermegomes.core.domain.User;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.core.exception.EmailException;
import com.br.guilhermegomes.core.exception.TaxNumberException;
import com.br.guilhermegomes.core.exception.TransactionPinException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.*;

import java.math.BigDecimal;

public class CreateUserUseCaseImpl implements CreateUserUseCase {
    private TaxNumberAvailableUseCase taxNumberAvailableUseCase;
    private EmailAvailableUseCase emailAvailableUseCase;
    private CreateUserGateway createUserGateway;
    private CreateWalletUseCase createWalletUseCase;
    private CreateTransactionPinUseCase createTransactionPinUseCase;

    public CreateUserUseCaseImpl(TaxNumberAvailableUseCase taxNumberAvailableUseCase, EmailAvailableUseCase emailAvailableUseCase, CreateUserGateway createUserGateway, CreateWalletUseCase createWalletUseCase, CreateTransactionPinUseCase createTransactionPinUseCase) {
        this.taxNumberAvailableUseCase = taxNumberAvailableUseCase;
        this.emailAvailableUseCase = emailAvailableUseCase;
        this.createUserGateway = createUserGateway;
        this.createWalletUseCase = createWalletUseCase;
        this.createTransactionPinUseCase = createTransactionPinUseCase;
    }

    @Override
    public void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException {
        if (!taxNumberAvailableUseCase.taxNumberAvaliable(user.getTaxNumber().getValue())) {
            throw new TaxNumberException(ErrorCodeEnum.ON0002.getMessage(), ErrorCodeEnum.ON0002.getCode());
        }
        if(!emailAvailableUseCase.emailAvailableEmail(user.getEmain())) {
            throw new EmailException(ErrorCodeEnum.ON0003.getMessage(), ErrorCodeEnum.ON0003.getCode());
        }

        var userCreated = createUserGateway.create(user);
        createWalletUseCase.create(new Wallet(BigDecimal.ZERO, userCreated));
        createTransactionPinUseCase.create(new TransactionPin(userCreated, pin));
    }
}
