package com.br.guilhermegomes.application.gateway;

import com.br.guilhermegomes.core.domain.Transaction;

public interface UserNotificationGateway {
    Boolean notificate(Transaction transaction, String email);
}
