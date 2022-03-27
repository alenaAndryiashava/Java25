package com.company;

//Imagine you are developing a system for on-line shop (or for a hotel or for a school
// or for a hospital or ....... for whatever area you want). Implement several classes.
// Come up with several classes connected by an inheritance relationship.
// Think about which methods should be implemented in the parent class,
// which in the descendant classes.
public class Main {

    public static void main(String[] args) {
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(5,2);
        Parallelogram parallelogram = new Parallelogram(4,5,2.5);
        Rhombus rhombus = new Rhombus(7,5,11);
        Trapezium trapezium = new Trapezium(13,5,8,5,7);
        Quadrilateral[] quadrilaterals = {square,rectangle,parallelogram,rhombus,trapezium};
        for (int i = 0; i < quadrilaterals.length; i++) {
            System.out.println(quadrilaterals[i]);
        }
    }
}
