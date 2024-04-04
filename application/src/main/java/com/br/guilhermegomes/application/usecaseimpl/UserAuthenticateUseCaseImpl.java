package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.UserAuthenticateGateway;
import com.br.guilhermegomes.core.exception.AuthenticateException;
import com.br.guilhermegomes.core.exception.NotFoundException;
import com.br.guilhermegomes.core.exception.enums.ErrorCodeEnum;
import com.br.guilhermegomes.usecase.UserAuthenticateUseCase;

public class UserAuthenticateUseCaseImpl implements UserAuthenticateUseCase {
    private UserAuthenticateGateway userAuthenticateGateway;

    public UserAuthenticateUseCaseImpl(UserAuthenticateGateway userAuthenticateGateway) {
        this.userAuthenticateGateway = userAuthenticateGateway;
    }

    @Override
    public Boolean authenticate(String email, String password) throws AuthenticateException {
        if(!userAuthenticateGateway.authenticate(email, password)) {
            throw new AuthenticateException(ErrorCodeEnum.ATH0001.getMessage(), ErrorCodeEnum.ATH0001.getCode());
        }
        return true;
    }
}
