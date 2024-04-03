package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.User;

public interface FindByTaxNumberUseCase {
    User findByTaxNumber(String taxNumber);
}
