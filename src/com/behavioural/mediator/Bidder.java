package com.behavioural.mediator;

public class Bidder implements IColleague{
    IAuctionMediator mediator;
    String name;
    public Bidder(IAuctionMediator mediator, String name){
        this.mediator = mediator;
        mediator.addBidder(this);
        this.name = name;
    }

    @Override
    public void placeBid(int x) {
        mediator.placeBid(x, this);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void receiveBidNotification(String msg) {
        System.out.println("Bidder " + name + " is notified with msg " + msg);
    }
}
