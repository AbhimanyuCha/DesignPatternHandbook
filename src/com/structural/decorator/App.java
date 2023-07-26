package com.structural.decorator;

import com.structural.decorator.coffee.Cappucino;
import com.structural.decorator.coffee.Coffee;
import com.structural.decorator.decorators.MochaSauceDecorator;

public class App {
    public static void main(String[] args) {
        Coffee c = new Cappucino();
        c = new MochaSauceDecorator(new MochaSauceDecorator(c));
        System.out.println(c.getCost());
    }
}
