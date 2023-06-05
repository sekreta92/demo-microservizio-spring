package com.example.demomicroserviziospring;

public class StatusResponse {

    private String status;
    private String message;


    public StatusResponse(String status, String message) {
        this.status = status;
        this.message = message;

    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
