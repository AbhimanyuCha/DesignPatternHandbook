package com.creational.prototype.example2;

public abstract class Shape implements Prototype {
    public int x_coordinate;
    public int y_coordinate;

    public Shape(){
        this.x_coordinate = 0;
        this.y_coordinate = 1;
    }

    public Shape(int xx , int yy){
        this.x_coordinate = xx;
        this.y_coordinate = yy;
    }
    public Shape(Shape obj) {
        this.x_coordinate = obj.x_coordinate;
        this.y_coordinate = obj.y_coordinate;
    }
}
