package com.devsuperior.desafioessential03.dto;

public class FieldMessage {

    private String fielName;
    private String message;

    public FieldMessage(String fielName, String message) {
        this.fielName = fielName;
        this.message = message;
    }

    public String getFielName() {
        return fielName;
    }

    public String getMessage() {
        return message;
    }
}
