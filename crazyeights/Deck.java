//package com.crazyeights;

import java.util.Collections;

/**
 * Created by carlosmo on 2016-01-30.
 *
 * @desc Representation of a full deck of cards
 */
public class Deck extends Pile {

    /**
     * @desc Deck constructor
     */
    Deck() {
        super();

        // Initializes a standard deck of 52 cards, with any card with a rank of 8 as a crazy eight
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                if (r == Rank.EIGHT) {
                    CrazyEightCard cec = new CrazyEightCard(s,r);
                    addCard(cec);
                }
                else {
                    Card c = new Card(s,r);
                    addCard(c);
                }
            }
        }
    }

    /**
     * @desc Shuffles the deck of cards
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @desc Removes the top card from the deck
     * @return Card - the top card from the deck
     */
    public Card removeTopCard() {
        Card temp = topCard();
        cards.remove(temp);
        return temp;
    }

    /**
     * @desc Deals 8 cards to the human player and 8 cards to the computer player from the deck
     * @param humanPlayer - the human player in the game
     * @param computerPlayer - the computer player in the game
     */
    public void deal(HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        for (int i=0; i < 16; i++) {
            if (i % 2 == 0) {
                humanPlayer.hand.addCard(removeTopCard());
            }
            else {
                computerPlayer.hand.addCard(removeTopCard());
            }
        }
    }

}
