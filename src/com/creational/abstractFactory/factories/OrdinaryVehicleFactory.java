package com.creational.abstractFactory.factories;

import com.creational.abstractFactory.vehicle.Hyundai;
import com.creational.abstractFactory.vehicle.IVehicle;
import com.creational.abstractFactory.vehicle.Kia;

public class OrdinaryVehicleFactory implements IVehicleFactory{
    @Override
    public IVehicle getVehicle(double nearestTorque) {
        // business logic for finding the ordinary vehicle
        if(nearestTorque < 400)
            return new Hyundai();
        else
            return new Kia();
    }
}
