package com.ashish.SpringBootprac.demo.entity;

import org.springframework.http.HttpStatus;

public class Errormessage {
    private HttpStatus status;
    private String message;

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Errormessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public Errormessage() {
    }
}
