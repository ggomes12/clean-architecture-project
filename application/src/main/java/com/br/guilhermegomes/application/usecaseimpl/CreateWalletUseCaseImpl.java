package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.CreateWalletGateway;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.usecase.CreateWalletUseCase;

public class CreateWalletUseCaseImpl implements CreateWalletUseCase {
    private CreateWalletGateway createWalletGateway;

    public CreateWalletUseCaseImpl(CreateWalletGateway createWalletGateway) {
        this.createWalletGateway = createWalletGateway;
    }

    @Override
    public void create(Wallet wallet) {
        createWalletGateway.create(wallet);
    }
}
