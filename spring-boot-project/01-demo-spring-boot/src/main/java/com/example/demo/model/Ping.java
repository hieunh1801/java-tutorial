package com.example.demo.model;

import java.util.Date;

public class Ping {
    private final String status;
    private final Date serverTime;
    private final String message;

    public Ping() {
        this.status = "Good";
        this.serverTime = new Date();
        this.message = "Message was created asfd sfd";
    }

    public Date getServerTime() {
        return serverTime;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
