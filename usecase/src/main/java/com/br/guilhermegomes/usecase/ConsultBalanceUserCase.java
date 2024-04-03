package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.Wallet;

import java.math.BigDecimal;

public interface ConsultBalanceUserCase {
    BigDecimal consult(Wallet wallet);
}
