package com.structural.decorator.decorators;

import com.structural.decorator.coffee.Coffee;

public class MochaSauceDecorator extends SauceDecorator{
    public MochaSauceDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public int getCost() {
        return this.wrappee.getCost() + 40;
    }
}
