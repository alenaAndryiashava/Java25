package com.company;

import java.io.IOException;
import java.io.UncheckedIOException;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
}
class NotCorrectPersonNameException extends MyUncheckedException{
    public NotCorrectPersonNameException(String msg) {
        super(msg);
    }
}
