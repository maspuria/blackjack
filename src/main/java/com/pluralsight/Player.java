package com.pluralsight;

public class Player {
   //field members
    private String name;
    private Hand hand;

    //constructor
    public Player(String name) {
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
