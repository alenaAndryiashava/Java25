package com.company;

public class Trapezium extends Quadrilateral{
    private double height;

    public Trapezium(double a, double b, double c, double d,double height) {
        super(a, b, c, d);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (getA()+getC())*getHeight()/2;
    }

    @Override
    public String getName() {
        return "Trapezium ";
    }
}
