package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.Wallet;

public interface FindWalletByTaxNumberGateway {
    Wallet findByTaxNumber(String taxNumber);
}
