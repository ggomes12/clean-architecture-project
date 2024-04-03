package com.br.guilhermegomes.usecase;

import com.br.guilhermegomes.core.domain.Transaction;

public interface UserNotificationUseCase {
    Boolean notificate(Transaction transaction, String email);
}
