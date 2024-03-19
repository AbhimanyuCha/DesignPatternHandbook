package com.behavioural.mediator;

public interface IAuctionMediator {
    void placeBid(int x, IColleague c);
    void addBidder(IColleague colleague);
}
