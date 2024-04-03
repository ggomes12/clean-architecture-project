package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.CreateTransactionPinGateway;
import com.br.guilhermegomes.core.domain.TransactionPin;
import com.br.guilhermegomes.usecase.CreateTransactionPinUseCase;

public class CreateTransactionPinUseCaseImpl implements CreateTransactionPinUseCase {
    private CreateTransactionPinGateway createTransactionPinGateway;

    public CreateTransactionPinUseCaseImpl(CreateTransactionPinGateway createTransactionPinGateway) {
        this.createTransactionPinGateway = createTransactionPinGateway;
    }

    @Override
    public void create(TransactionPin transactionPin) {
        createTransactionPinGateway.create(transactionPin);
    }

}
