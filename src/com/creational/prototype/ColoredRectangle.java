package com.creational.prototype;

public class ColoredRectangle extends Rectangle implements Prototype{
    String color;

    public ColoredRectangle(String color){
        super();
        this.color = color;
    }
    public ColoredRectangle(ColoredRectangle obj){
        super(obj);
        this.color = obj.color;
    }

    @Override
    public Prototype _clone(){
        return new ColoredRectangle(this);
    }

}
