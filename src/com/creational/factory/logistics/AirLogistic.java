package com.creational.factory.logistics;

public class AirLogistic implements Logistic{
    @Override
    public void deliver() {
        System.out.println("Delivering this via Airways");
    }
}
