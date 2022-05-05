package com.company;

public class FullStackProgrammer extends Programmer{
    public FullStackProgrammer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public String toString() {
        return "FullStack " + super.toString();
    }

    @Override
    public void doWork() {

    }
}
