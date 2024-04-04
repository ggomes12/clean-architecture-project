package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.CreateTransactionGateway;
import com.br.guilhermegomes.core.domain.Transaction;
import com.br.guilhermegomes.core.exception.TransferException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.CreateTransactionUseCase;

public class CreateTransactionUseCaseImpl implements CreateTransactionUseCase {
    private CreateTransactionGateway createTransactionGateway;
    @Override
    public Transaction create(Transaction transaction) throws TransferException {
        var transactionSaved = createTransactionGateway.create(transaction);

        if(transactionSaved == null){
            throw new TransferException(ErrorCodeEnum.TR0003.getMessage(), ErrorCodeEnum.TR0003.getCode());
        }
        return transactionSaved;
    }
}
