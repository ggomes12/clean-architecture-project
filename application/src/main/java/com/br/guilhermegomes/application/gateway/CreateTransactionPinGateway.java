package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.TransactionPin;

public interface CreateTransactionPinGateway {
    void create(TransactionPin transactionPin);
}
