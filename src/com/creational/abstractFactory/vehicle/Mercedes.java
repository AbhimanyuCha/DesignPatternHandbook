package com.creational.abstractFactory.vehicle;

import com.creational.abstractFactory.vehicle.IVehicle;

public class Mercedes implements IVehicle {
    @Override
    public double getTorque() {
        return 650;
    }

    @Override
    public double getFuelAvg() {
        return 5;
    }

    @Override
    public void drive() {
        System.out.println("Driving Mercedes now !!");
    }
}
