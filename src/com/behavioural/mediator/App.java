package com.behavioural.mediator;

public class App {
    public static void main(String[] args) {
        IAuctionMediator mediator = new ConcreteAuctionMediator();
        IColleague mark = new Bidder(mediator , "mark");
        IColleague ben = new Bidder(mediator, "ben");

        ben.placeBid(120);
        mark.placeBid(10);


    }
}
