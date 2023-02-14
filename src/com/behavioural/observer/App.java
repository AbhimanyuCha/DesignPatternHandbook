package com.behavioural.observer;

import com.behavioural.observer.coffee.Cappucino;
import com.behavioural.observer.coffee.Coffee;
import com.behavioural.observer.decorators.MochaSauceDecorator;

public class App {
    public static void main(String[] args) {
        Coffee c = new Cappucino();
        c = new MochaSauceDecorator(new MochaSauceDecorator(c));
        System.out.println(c.getCost());
    }
}
