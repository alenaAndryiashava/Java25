package com.company;

public class UncheckedFileNotFoundException extends MyUncheckedException{
    public UncheckedFileNotFoundException(String msg) {
        super(msg);
    }

    public UncheckedFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
