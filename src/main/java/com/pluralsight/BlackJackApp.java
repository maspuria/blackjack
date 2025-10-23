package com.pluralsight;

import java.util.ArrayList;

public class BlackJackApp {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand1 = new Hand();

        //Player ArrayList
        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Mari"));
        players.add(new Player("Mario"));
        players.add(new Player("Catrina"));
        players.add(new Player("Truth"));

        // deal 2 cards
        for(int i = 0; i < 2; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }
        int handValue = hand1.getValue();
        System.out.println("This hand is worth " + handValue);
    }

}


