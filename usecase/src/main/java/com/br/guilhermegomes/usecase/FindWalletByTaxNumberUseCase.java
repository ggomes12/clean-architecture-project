package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.User;
import com.br.guilhermegomes.core.domain.Wallet;
import com.br.guilhermegomes.core.exception.NotFoundException;

public interface FindWalletByTaxNumberUseCase {
    Wallet findByTaxNumber(String taxNumber) throws NotFoundException;
}
