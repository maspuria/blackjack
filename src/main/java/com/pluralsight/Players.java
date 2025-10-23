package com.pluralsight;

public class Players {
   //field members
    private String name;
    private Hand hand;
    private

    //constructor
    public Players(String name) {
        this.name = name;
        this.hand = new Hand();
    }
    // getters
    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    @Override
    public String toString() {
        return "Players {" +
                "name = '" + name + '\'' +
                ", hand =" + hand +
                '}';
    }

}
