package com.br.guilhermegomes.usecase;


import com.br.guilhermegomes.core.exception.InternalServerErrorException;

import java.math.BigDecimal;

public interface TransferUseCase {
    Boolean transfer(String fromTaxNumber, String toTaxNumber, BigDecimal value) throws InternalServerErrorException, Exception;
}
