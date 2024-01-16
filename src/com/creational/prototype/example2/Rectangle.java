package com.creational.prototype.example2;

public class Rectangle extends Shape{

    int width;
    int length;
    public Rectangle(){
        width = 0;
        length = 0;
    }
    public Rectangle(int w , int l){
        super();
        width = w;
        length = l;
    }

    Rectangle(Rectangle obj){
        super(obj);
        this.width = obj.width;
        this.length = obj.length;
    }
    @Override
    public Prototype _clone() {
        return new Rectangle(this);
    }
}
