package com.creational.factory.logistics;

public class RoadLogistic implements Logistic{
    @Override
    public void deliver() {
        System.out.println("Delivering goods via Roadways");
    }
}
