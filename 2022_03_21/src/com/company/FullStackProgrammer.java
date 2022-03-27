package com.company;

public class FullStackProgrammer extends Programmer{
    public FullStackProgrammer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "FullStack " + super.toString();
    }
}
