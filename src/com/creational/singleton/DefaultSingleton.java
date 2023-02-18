package com.creational.singleton;

import java.util.Objects;

public class DefaultSingleton {
    private static DefaultSingleton instance = null;
    private DefaultSingleton(){}
    public static DefaultSingleton getInstance(){
        if(Objects.isNull(instance))
            instance = new DefaultSingleton();
        return instance;
    }
}
