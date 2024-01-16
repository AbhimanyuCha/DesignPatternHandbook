package com.creational.prototype.example1;

public class Button implements Prototype{

    private int x, y;
    private String color;

    public Button(int x , int y , String color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    //copy constructor
    private Button(Button b){
        this.x = b.x;
        this.y = b.y;
        this.color = b.color;
    }

    @Override
    public Prototype clone() {
        return new Button(this);
    }
}
