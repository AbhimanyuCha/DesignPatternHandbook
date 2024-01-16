package com.creational.abstractFactory.vehicle;

import com.creational.abstractFactory.vehicle.IVehicle;

public class Jaguar implements IVehicle {
    @Override
    public double getTorque() {
        return 750;
    }

    @Override
    public double getFuelAvg() {
        return 4;
    }

    @Override
    public void drive() {
        System.out.println("Driving Jaguar now !!");
    }
}
