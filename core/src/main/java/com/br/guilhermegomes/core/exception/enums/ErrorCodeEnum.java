package com.br.guilhermegomes.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("Invalid tax number", "ON-0001"),
    ON0002("Unavailable tax number", "ON-0002"),
    ON0003("Unavailable email", "ON-0003"),
    ON0004("Error created of the user", "ON-0004"),

    TR0001("ShopKeeper The merchant does not have the Transfer function available", "TR-0001"),
    TR0002("Insufficient balance", "TR-0002"),
    TR0003("Error of the transaction", "TR-0003"),
    TR0004("Transfer do not authorization", "TR-0004"),

    TRP0001("Invalid transaction pin", "TRP-0001"),

    WA0001("Wallet not found", "WA-0001"),

    NO0003("Error of the transfer", "NO-0003"),

    ATH0001("Invalid email or password", "ATH-0001")

    ;

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
