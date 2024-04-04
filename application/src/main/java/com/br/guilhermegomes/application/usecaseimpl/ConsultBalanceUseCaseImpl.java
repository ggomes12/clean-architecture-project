package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.ConsultBalanceGateway;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.usecase.ConsultBalanceUseCase;

import java.math.BigDecimal;

public class ConsultBalanceUseCaseImpl implements ConsultBalanceUseCase {
    private ConsultBalanceGateway consultBalanceGateway;

    public ConsultBalanceUseCaseImpl(ConsultBalanceGateway consultBalanceGateway) {
        this.consultBalanceGateway = consultBalanceGateway;
    }

    @Override
    public BigDecimal consult(Wallet wallet) {
        return consultBalanceGateway.consult(wallet);
    }
}
