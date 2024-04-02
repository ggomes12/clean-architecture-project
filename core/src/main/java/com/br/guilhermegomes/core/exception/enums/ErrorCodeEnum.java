package com.br.guilhermegomes.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("Invalid tax number", "ON-0001"),
    TR0001("ShopKeeper The merchant does not have the Transfer function available", "TR-0001"),
    TR0002("Insufficient balance", "TR-0002"),
    TRP0001("Invalid transaction pin", "TRP-0001"),;

    private String message;
    private String code;

    ErrorCodeEnum(String code, String message) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
