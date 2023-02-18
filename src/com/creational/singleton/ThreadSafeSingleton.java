package com.creational.singleton;

import java.util.Objects;

public class ThreadSafeSingleton {
    static volatile ThreadSafeSingleton instance = null;
    static volatile int test = 100;
    private ThreadSafeSingleton(){}
    public static ThreadSafeSingleton getInstance(){
        if(Objects.isNull(instance)) {
            synchronized (ThreadSafeSingleton.class) {
                if(Objects.isNull(instance)) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
