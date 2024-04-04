package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.usecase.ConsultBalanceUseCase;

import java.math.BigDecimal;

public interface ConsultBalanceGateway{
    BigDecimal consult(Wallet wallet);

}
