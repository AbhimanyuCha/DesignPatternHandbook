package com.creational.abstractFactory.factories;

import com.creational.abstractFactory.vehicle.IVehicle;
import com.creational.abstractFactory.vehicle.Jaguar;
import com.creational.abstractFactory.vehicle.Mercedes;

public class LuxuryVehicleFactory implements IVehicleFactory{
    @Override
    public IVehicle getVehicle(double nearestTorque) {
        // business logic for finding the luxury vehicle
        if(nearestTorque >= 700)
            return new Jaguar();
        else
            return new Mercedes();
    }
}
