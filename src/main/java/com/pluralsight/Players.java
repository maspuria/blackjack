package com.pluralsight;

public class Players {
   //field members
    private String name;
    private Hand hand;

    //constructor
    public Players(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }
    // getters
    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

}
