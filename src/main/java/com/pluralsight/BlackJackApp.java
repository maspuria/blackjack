package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackJackApp {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();

        List<String> playerNames = getPlayerNames();

        int highestPoints = 0;
        String winnerName = null;

        for (String playerName : playerNames) {
            Hand hand = new Hand();
            // deal 2 cards
            for (int i = 0; i < 2; i++) {
                // get a card from the deck
                Card card = deck.deal();
                // deal that card to the hand
                hand.deal(card);
            }
            int totalValue = hand.getValue();

            System.out.println(playerName + "'s hand: ");
            System.out.println(hand);
            System.out.println("Total value: " + hand.getValue());

            if (totalValue <= 21 && totalValue > highestPoints) {
                highestPoints = totalValue;
                winnerName = playerName;
            }
        }
        System.out.println("\n ======== Drum Roll ========");
        if (winnerName != null) {
            System.out.println("The winner of BlackJack: " + winnerName + " with " + highestPoints + " points!! ");
        } else {
            System.out.println(" UH OH. There are NO winners! Time to play BlackJack again!");
        }
    }
    public static List<String> getPlayerNames() {
        Scanner scanner = new Scanner(System.in);
        List<String> playerList = new ArrayList<>();
        System.out.print("===== Welcome to BlackJack =====\n");
        System.out.println("========= Let's Play! ==========");
        System.out.println();

        System.out.print("Enter number of players: ");
        int playerCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < playerCount; i++) {
            System.out.print("Enter player " + (i +1) + " name: ");
            String playerName = scanner.nextLine();

            playerList.add("\n" + playerName);
        }
        return playerList;
    }
//        System.out.print("===== Welcome to BlackJack =====\n");
//        System.out.println("\n ===== Let's Play! =====");
//        System.out.println();
//
//        ArrayList<Player> players = new ArrayList<>();
//        players.add(new Player("Mari"));
//        players.add(new Player("Mario"));
//        players.add(new Player("Truth"));
//        players.add(new Player("Catrina"));
}


