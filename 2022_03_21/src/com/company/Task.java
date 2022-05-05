package com.company;

public class Task {
    private int id;
    private String status;
    private String description;


    public Task(int id, String status, String description) {
        this.id = id;
        this.status = status;
        this.description = description;

    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}
