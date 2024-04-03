package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.Transaction;

public interface CreateTransactionUseCase {
    void create(Transaction transaction);
}
