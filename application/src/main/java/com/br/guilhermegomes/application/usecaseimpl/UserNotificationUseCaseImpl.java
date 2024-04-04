package com.br.guilhermegomes.application.usecaseimpl;

import com.br.guilhermegomes.application.gateway.UserNotificationGateway;
import com.br.guilhermegomes.core.domain.Transaction;
import com.br.guilhermegomes.usecase.UserNotificationUseCase;

public class UserNotificationUseCaseImpl implements UserNotificationUseCase {
    private UserNotificationGateway userNotificationGateway;
    @Override
    public Boolean notificate(Transaction transaction, String email) {
        return userNotificationGateway.notificate(transaction, email);
    }
}
