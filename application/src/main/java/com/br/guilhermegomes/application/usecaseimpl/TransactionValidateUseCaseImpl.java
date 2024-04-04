package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.TransactionValidateGateway;
import com.br.guilhermegomes.core.domain.Transaction;
import com.br.guilhermegomes.core.exception.TransferException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.TransactionValidateUseCase;

public class TransactionValidateUseCaseImpl implements TransactionValidateUseCase {
    private TransactionValidateGateway transactionValidateGateway;
    @Override
    public Boolean validate(Transaction transaction) throws TransferException {
        if (!transactionValidateGateway.validate(transaction)) {
            throw new TransferException(ErrorCodeEnum.TR0004.getMessage(), ErrorCodeEnum.TR0004.getCode());
        }
        return true;
    }
}
