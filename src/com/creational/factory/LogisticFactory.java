package com.creational.factory;

import com.creational.factory.logistics.AirLogistic;
import com.creational.factory.logistics.Logistic;
import com.creational.factory.logistics.RoadLogistic;
import com.creational.factory.logistics.SeaLogistic;
import com.sun.istack.internal.NotNull;

import java.util.Objects;
//non threadsafe singleton factory.
public class LogisticFactory {
    private static LogisticFactory instance = null;
    private LogisticFactory(){}
    public static LogisticFactory getInstance(){
        if(Objects.isNull(instance))
            instance = new LogisticFactory();
        return instance;
    }

    public Logistic getLogistics(@NotNull LogisticType logisticType){
        switch(logisticType){
            case AIR:
                return new AirLogistic();
            case SEA:
                return new SeaLogistic();
            case ROAD:
                return new RoadLogistic();
        }
        return null;
    }
}
