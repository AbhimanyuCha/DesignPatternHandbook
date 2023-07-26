package com.structural.decorator.decorators;

import com.structural.decorator.coffee.Coffee;

public abstract class SauceDecorator extends Coffee {
    Coffee wrappee;
    SauceDecorator(Coffee c){
        this.wrappee = c;
    }
}
