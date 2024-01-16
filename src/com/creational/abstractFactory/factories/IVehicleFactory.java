package com.creational.abstractFactory.factories;

import com.creational.abstractFactory.vehicle.IVehicle;

public interface IVehicleFactory {
    IVehicle getVehicle(double nearestTorque);
}
