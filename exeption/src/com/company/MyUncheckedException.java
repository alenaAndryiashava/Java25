package com.company;

public class MyUncheckedException extends RuntimeException {
    private String msg;

    public MyUncheckedException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public MyUncheckedException(String message, Throwable cause) {
        super(message, cause);
        this.msg = cause.getMessage();
    }

    public void print(){
        System.out.println(msg);
    }
}
