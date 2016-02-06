//package com.crazyeights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by carlosmo on 2016-01-31.
 *
 * @desc Representation of a generic grouping of cards
 */
public class Pile {
    List<Card> cards;

    /**
     * @desc Pile constructor
     */
    Pile() {
        cards = new ArrayList<Card>();
    }

    /**
     * @desc Determines the number of cards in the pile
     * @return int - the number of cards in the pile
     */
    public int size() {
        return cards.size();
    }

    /**
     * @desc Adds a card to the pile
     * @param c - the card to be added
     */
    public void addCard(Card c) {
        cards.add(c);
    }

    /**
     * @desc Gets the card at the top of the pile
     * @return Card - the card that was at the top of the pile
     */
    public Card topCard() {
        return cards.get(size()-1);
    }

    /**
     * @desc Displays all the cards in the pile
     */
    public void display() {
        System.out.println(cards);
    }

}
