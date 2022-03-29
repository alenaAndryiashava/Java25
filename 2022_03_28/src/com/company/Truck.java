package com.company;

public class Truck extends Vehicle{
    private int loadCapacity;

    public Truck(String model, String carNumber, int year, int loadCapacity) {
        super(model,carNumber, year);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void goToRace() {
        System.out.println(super.toString() + " carries " + getLoadCapacity() + " tons.");
    }
}
