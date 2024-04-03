package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.User;
import com.br.guilhermegomes.core.exception.EmailException;
import com.br.guilhermegomes.core.exception.TaxNumberException;
import com.br.guilhermegomes.core.exception.TransactionPinException;

public interface CreateUserUseCase {
    void create(User user, String pin) throws TaxNumberException, EmailException, TransactionPinException;
}
