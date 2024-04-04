package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.exception.AuthenticateException;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String email, String password) throws AuthenticateException;
}
