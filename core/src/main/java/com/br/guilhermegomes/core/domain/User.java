package com.br.guilhermegomes.core.domain;

import com.br.guilhermegomes.core.enums.UserTypeEnum;

import java.time.LocalDateTime;
import java.util.Objects;
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

    public User(UUID id, String emain, String password, TaxNumber taxNumber, String fullName, UserTypeEnum type, TransactionPin transactionPin, LocalDateTime createdAt, LocalDateTime updateAt) {
        this.id = id;
        this.emain = emain;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullName = fullName;
        this.type = type;
        this.transactionPin = transactionPin;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    public User(String emain, String password, TaxNumber taxNumber, String fullName, UserTypeEnum type, TransactionPin transactionPin) {
        this.emain = emain;
        this.password = password;
        this.taxNumber = taxNumber;
        this.fullName = fullName;
        this.type = type;
        this.transactionPin = transactionPin;
    }
    public User() {}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmain() {
        return emain;
    }

    public void setEmain(String emain) {
        this.emain = emain;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TaxNumber getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(TaxNumber taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserTypeEnum getType() {
        return type;
    }

    public void setType(UserTypeEnum type) {
        this.type = type;
    }

    public TransactionPin getTransactionPin() {
        return transactionPin;
    }

    public void setTransactionPin(TransactionPin transactionPin) {
        this.transactionPin = transactionPin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }


    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getEmain(), user.getEmain()) && Objects.equals(getPassword(), user.getPassword()) && Objects.equals(getTaxNumber(), user.getTaxNumber()) && Objects.equals(getFullName(), user.getFullName()) && getType() == user.getType() && Objects.equals(getTransactionPin(), user.getTransactionPin()) && Objects.equals(getCreatedAt(), user.getCreatedAt()) && Objects.equals(getUpdateAt(), user.getUpdateAt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEmain(), getPassword(), getTaxNumber(), getFullName(), getType(), getTransactionPin(), getCreatedAt(), getUpdateAt());
    }
}
