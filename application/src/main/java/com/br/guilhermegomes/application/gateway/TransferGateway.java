package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.Transaction;

public interface TransferGateway {
    Boolean transfer(Transaction transaction);
}
