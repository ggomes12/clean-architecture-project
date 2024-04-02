package com.br.guilhermegomes.core.domain;

import java.time.LocalDateTime;
import java.util.UUID;

public class User {
    private UUID id;
    private String emain;
    private String password;
    private TaxNumber taxNumber;
    private String fullName;
    private UserTypeEnum type;
    private TransactionPin transactionPin;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
}
