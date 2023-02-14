package com.behavioural.observer.decorators;

import com.behavioural.observer.coffee.Coffee;

public class MochaSauceDecorator extends SauceDecorator{
    public MochaSauceDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int getCost() {
        return this.wrappee.getCost() + 40;
    }
}
