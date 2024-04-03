package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.User;

public interface CreateUserGateway {
    User create(User user);
}
