package com.br.guilhermegomes.usecase;

public interface UserAuthenticateUseCase {
    Boolean authenticate(String email, String password);
}
