package com.company;

public class Rhombus extends Quadrilateral{
    private double height;

    public Rhombus(double a, double b, double height) {
        super(a, b,a,b);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return getA()*getHeight();
    }

    @Override
    public String getName() {
        return "Rhombus ";
    }
}
