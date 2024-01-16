package com.creational.abstractFactory;

import com.creational.abstractFactory.factories.AbstractVehicleFactory;
import com.creational.abstractFactory.factories.IVehicleFactory;
import com.creational.abstractFactory.vehicle.IVehicle;

public class Client {
    public static void main(String[] args) {
        double sampleTorque = 335;
        IVehicleFactory factory = AbstractVehicleFactory.getVehicleFactory(sampleTorque);
        IVehicle vehicle = factory.getVehicle(sampleTorque);
        vehicle.drive();
    }
}
