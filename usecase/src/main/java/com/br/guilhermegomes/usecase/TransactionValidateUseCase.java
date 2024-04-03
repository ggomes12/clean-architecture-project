package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.Transaction;

public interface TransactionValidateUseCase {
    Boolean validate(Transaction transaction);
}
