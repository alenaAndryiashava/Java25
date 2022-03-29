package com.company;

public class Car extends Vehicle{
    private int loadCapacity;
    private int passengerCapacity;

    public Car(String model,String carNumber, int year, int loadCapacity, int passengerCapacity) {
        super(model, carNumber, year);
        this.loadCapacity = loadCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void goToRace() {
        System.out.println(super.toString() + " carries " + getPassengerCapacity() +
                          " passengers or " + getLoadCapacity() + " tons.");
    }
}
