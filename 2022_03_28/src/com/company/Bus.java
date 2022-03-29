package com.company;

public class Bus extends Vehicle{
    private int passengerCapacity;

    public Bus(String model, String carNumber, int year, int passengerCapacity) {
        super(model,carNumber, year);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void goToRace() {
        System.out.println(super.toString() + " carries " + getPassengerCapacity() + " passengers.");

    }
}
