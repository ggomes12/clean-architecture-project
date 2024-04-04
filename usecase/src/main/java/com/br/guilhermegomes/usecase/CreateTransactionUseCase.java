package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.Transaction;
import com.br.guilhermegomes.core.exception.TransferException;

public interface CreateTransactionUseCase {
    Transaction create(Transaction transaction) throws TransferException;
}
