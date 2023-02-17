package com.creational.factory.logistics;

public class SeaLogistic implements Logistic{
    @Override
    public void deliver() {
        System.out.println("Delivering goods via waterways !");
    }
}
