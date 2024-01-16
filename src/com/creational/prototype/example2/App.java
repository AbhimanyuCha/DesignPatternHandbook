package com.creational.prototype.example2;

public class App {
    public static void main(String[] args){
        ColoredRectangle r1 = new ColoredRectangle("red");
        r1.x_coordinate = 0;
        r1.y_coordinate = 10;
        r1.length = 100;
        r1.width = 100;
        Rectangle r2 = (ColoredRectangle) r1._clone();
        System.out.println(r2.x_coordinate + " " + r2.y_coordinate + " " + r2.width + " " + r2.length + " ");
    }
}
