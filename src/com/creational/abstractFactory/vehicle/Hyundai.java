package com.creational.abstractFactory.vehicle;

import com.creational.abstractFactory.vehicle.IVehicle;

public class Hyundai implements IVehicle {
    @Override
    public double getTorque() {
        return 350;
    }

    @Override
    public double getFuelAvg() {
        return 17;
    }

    @Override
    public void drive() {
        System.out.println("Driving Hyundai now !!");
    }
}
