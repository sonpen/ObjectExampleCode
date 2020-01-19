package com.sonpen.chapter01;

/**
 * Created by sonpen on 20. 1. 19.
 */
public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}
