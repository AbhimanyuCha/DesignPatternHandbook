package com.behavioural.observer.decorators;

import com.behavioural.observer.coffee.Coffee;

public abstract class SauceDecorator extends Coffee {
    Coffee wrappee;
    SauceDecorator(Coffee c){
        this.wrappee = c;
    }
}
