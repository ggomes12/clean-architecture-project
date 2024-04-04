package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.TransactionPin;
import com.br.guilhermegomes.core.domain.User;
import com.br.guilhermegomes.core.domain.Wallet;

public interface CreateUserGateway {
    Boolean create(User user, Wallet wallet, TransactionPin transactionPin);
}
