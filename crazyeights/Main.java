//package com.crazyeights;

import java.util.Scanner;

public class Main {

    /**
     * @desc Runs the program that simulates the card game, Crazy Eights
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompts the user to entire the names of the participating players
        System.out.println("Let's play Crazy Eights!");
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        HumanPlayer humanPlayer = new HumanPlayer(name);

        System.out.print("Please enter your opponent's name: ");
        name = sc.nextLine();

        ComputerPlayer computerPlayer = new ComputerPlayer(name);

        // Creates a new deck, shuffles it and then deal the cards to the players
        Deck deck = new Deck();
        deck.shuffle();
        deck.deal(humanPlayer, computerPlayer);

        // Draw a card from the deck to initiate the play pile
        Pile playPile = new Pile();
        playPile.addCard(deck.removeTopCard());

        // Alternate turns between the human player and computer player until one party wins
        int turn = 0;
        while(!(humanPlayer.win() || computerPlayer.win())) {
            if ( turn == 0 ) humanPlayer.move(deck, playPile);
            else computerPlayer.move(deck, playPile);
            turn = (turn + 1) % 2;
        }

        // Display winning or losing message
        if (humanPlayer.win()) System.out.println("\nCongratulations! " + humanPlayer.name + " wins the game!");
        else System.out.println("\nSorry. " + computerPlayer.name + " wins the game.");
    }
}
