package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.Transaction;

public interface TransferUseCase {
    Boolean transfer(Transaction transactions);
}
