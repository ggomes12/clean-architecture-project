package com.br.guilhermegomes.core.exception;

public class TransactionPinException extends Throwable{
    private String code;

    public TransactionPinException(String message, String code) {
        super(message);
        this.code = code;
    }
}