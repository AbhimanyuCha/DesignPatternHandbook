package com.creational.abstractFactory.factories;

public class AbstractVehicleFactory {
    public static IVehicleFactory getVehicleFactory(double nearestTorque){
        LuxuryVehicleFactory luxuryVehicleFactory = new LuxuryVehicleFactory();
        OrdinaryVehicleFactory ordinaryVehicleFactory = new OrdinaryVehicleFactory();
        if(nearestTorque >= 400)
            return luxuryVehicleFactory;
        else
            return ordinaryVehicleFactory;
    }
}
