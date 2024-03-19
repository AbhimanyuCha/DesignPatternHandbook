package com.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAuctionMediator implements IAuctionMediator{

    List<IColleague> listOfBidders;
    public ConcreteAuctionMediator(){
        listOfBidders = new ArrayList<>();
    }
    @Override
    public void placeBid(int x , IColleague b) {
        String msg = "Bid placed by " + b.getName() + " for amount " + x;
        System.out.println(msg);
        for(var bidder : listOfBidders){
            if(bidder.getName().equals(b.getName())) continue;
            bidder.receiveBidNotification(msg);
        }
    }

    @Override
    public void addBidder(IColleague colleague) {
        this.listOfBidders.add(colleague);
    }
}
