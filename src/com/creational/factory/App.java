package com.creational.factory;

import com.creational.factory.logistics.Logistic;

public class App {
    private static final LogisticFactory logisticFactory = LogisticFactory.getInstance();
    App(){}

    public static void main(String[] args) {
        LogisticType airLogi = LogisticType.AIR;
        Logistic logistic = logisticFactory.getLogistics(airLogi);
        logistic.deliver();
    }
}
