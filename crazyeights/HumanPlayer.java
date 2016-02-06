//package com.crazyeights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by carlosmo on 2016-01-31.
 *
 * @desc Representation of a human player
 */
public class HumanPlayer extends Player {

    /**
     * @desc HumanPlayer constructor
     * @param name - name of the human player
     */
    HumanPlayer(String name) {
        super(name);
    }

    /**
     * @desc Determines the move that the human player will make during their turn
     * @param deck - the current deck of cards
     * @param playPile - the current pile of cards that are in play
     */
    @Override
    public void move(Deck deck, Pile playPile) {
        Scanner sc = new Scanner(System.in);
        int drawCount = 0;
        boolean activeMove = true;
        String hr = "\n*************************************************\n";
        System.out.print(hr);

        while (activeMove) {
            // Display the current card in play
            System.out.println("\nCard in play:");
            playPile.topCard().display();

            // Determine the currently active suit and then display it
            Suit activeSuit;
            if(playPile.topCard().isCrazyEight()) {
                activeSuit = ((CrazyEightCard) playPile.topCard()).declared;
            }
            else {
                activeSuit = playPile.topCard().suit;
            }

            System.out.println("\nActive suit:\n" + activeSuit);

            // Display the human player's sorted hand
            System.out.println("\n" + name + "'s hand:");
            hand.sort();
            hand.display();

            // Display the human player's possible actions
            if (drawCount < 3) {
                System.out.print("\nDo you want to draw ('D') or play ('P')? ");
            }
            else {
                System.out.println("\nYou have already drawn a maximum of 3 cards.");
                System.out.print("Do you want to play ('P') or skip ('S')? ");
            }

            String action = sc.nextLine();
            action = action.toUpperCase();

            // Human Player chooses to draw
            if (action.equals("D") && drawCount < 3) {
                // Human Player reshuffles the deck if there are no more cards in the deck
                if (deck.size() == 0) {
                    reshuffleDeck(deck, playPile);
                    System.out.println(name + " reshuffled the deck.");
                }

                // Human Player draws a card from the top of the deck
                draw(deck, 1);
                drawCount++;
                System.out.println(hr + "You drew a " + hand.topCard());

            }
            // Human Player chooses to play
            else if (action.equals("P")) {
                // Prompt the human player to input the cards that they want to play
                System.out.print("Please enter the card(s) that you would like to play (eg. THREE of DIAMONDS, THREE of SPADES): ");
                String playCards = sc.nextLine().toUpperCase();

                List<String> playCardsStringList = Arrays.asList(playCards.split("\\s*,\\s*"));
                List<Card> playCardsList = new ArrayList<Card>();
                boolean validMove = true;

                // Check if the human player has the inputted cards in their hand
                for (int i = 0; validMove && i < playCardsStringList.size(); i++) {
                    String[] cardStringArray = playCardsStringList.get(i).split("\\s*OF\\s*");

                    Card tempCard;

                    if (Rank.valueOf(cardStringArray[0]) == Rank.EIGHT) {
                        tempCard = new CrazyEightCard(Suit.valueOf(cardStringArray[1]), Rank.valueOf(cardStringArray[0]));
                    } else {
                        tempCard = new Card(Suit.valueOf(cardStringArray[1]), Rank.valueOf(cardStringArray[0]));
                    }

                    if (hand.contains(tempCard)) {
                        playCardsList.add(tempCard);
                    } else {
                        validMove = false;
                        System.out.println(hr + "Invalid move. You do not have a " + tempCard);
                    }
                }

                // Check if the inputted cards are considered legal moves in Crazy Eights
                if (validMove) {
                    // If a crazy eight is played, prompt the user to declare a new active suit
                    if (playCardsList.get(0).isCrazyEight()) {
                        System.out.print("You played a Crazy Eight! Please declare a suit (CLUBS, DIAMONDS, HEARTS or SPADES): ");
                        String declaredSuit = sc.nextLine().toUpperCase();

                        ((CrazyEightCard) playCardsList.get(0)).declareSuit(Suit.valueOf(declaredSuit));
                        System.out.println(hr + "You declared " + ((CrazyEightCard) playCardsList.get(0)).declared + " as the active suit.");

                    }
                    // Check if the first card played matches the active suit or rank
                    else if (!((playCardsList.get(0).suit == activeSuit) ||
                                (playCardsList.get(0).rank == playPile.topCard().rank))) {
                        validMove = false;
                        System.out.println(hr + "Invalid move.  You must first play a card from your hand that matches the active suit or rank of the card in play.");
                    }
                }

                // If human player attempts to play more than one card, verify that the subsequent cards match the rank of the first card played
                if (validMove) {
                    if (playCardsList.size() > 1) {
                        for (int i = 1; validMove && i < playCardsList.size(); i++) {
                            if (playCardsList.get(i).rank != playCardsList.get(0).rank) {
                                validMove = false;
                                System.out.println(hr + "Invalid move. Subsequent cards after the first must match the rank of the first card played.");
                            }
                        }
                    }
                }

                // If the inputted move is determined to be valid, remove the card(s) from the human player's hand and add them to the play pile
                if (validMove) {
                    for (Card c : playCardsList) {
                        Card tempCard = hand.remove(c);
                        if (c.isCrazyEight()) {
                            ((CrazyEightCard) tempCard).declareSuit(((CrazyEightCard) c).declared);
                        }
                        playPile.addCard(tempCard);
                    }

                    activeMove = false;
                }
            }
            // Human Player chooses to skip their turn
            else if (action.equals("S") && drawCount == 3) {
                System.out.println(hr + "You have chosen to skip your turn.");
                activeMove = false;
            }
            // Human Player inputted invalid actions
            else {
                if (drawCount < 3) {
                    System.out.println(hr + "Invalid input.  Please enter 'D' to draw from the deck, 'P' to play a card.");
                }
                else {
                    System.out.println(hr + "Invalid input.  Please enter 'P' to play a card, or 'S' to skip your turn.");
                }
            }
        }

    }
}
