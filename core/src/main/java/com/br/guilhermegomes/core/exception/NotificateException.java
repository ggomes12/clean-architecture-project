package com.br.guilhermegomes.core.exception;

public class NotificateException extends Exception{
    private String code;
    public NotificateException(String message, String code) {
        super(message);
        this.code = code;
    }
}
