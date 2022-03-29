package com.company;

public abstract class Vehicle {
    private final String model;
    private final String carNumber;
    private final int year;

    public Vehicle(String name, String carNumber, int year) {
        this.model = name;
        this.carNumber = carNumber;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Vehicle: " + getModel()+
                ", car Number = " + getCarNumber() +
                ", year = " + getYear();
    }
    public abstract void goToRace();


}
