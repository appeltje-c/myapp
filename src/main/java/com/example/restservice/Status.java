package com.example.restservice;

public class Status {

    private long id;
    private String content;

    public Status(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}