package com.creational.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i = 0 ; i < 5 ; i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    ThreadSafeSingleton obj = ThreadSafeSingleton.getInstance();
                    // the obj is only created once although multiple threads are trying to access it
                    // simultaneously.
                }
            });
        }
        executorService.shutdown();
    }
}
