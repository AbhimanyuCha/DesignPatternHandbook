package com.creational.abstractFactory.vehicle;

import com.creational.abstractFactory.vehicle.IVehicle;

public class Kia implements IVehicle {
    @Override
    public double getTorque() {
        return 435;
    }

    @Override
    public double getFuelAvg() {
        return 11;
    }

    @Override
    public void drive() {
        System.out.println("Driving Kia now !!");
    }
}
