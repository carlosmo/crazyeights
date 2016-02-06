//package com.crazyeights;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by carlosmo on 2016-01-31.
 *
 * @desc Represents a player's hand
 */
public class Hand extends Pile {

    /**
     * @desc Hand constructor
     */
    Hand() {
        super();
    }

    /**
     * @desc Remove a card from the player's hand
     * @param c - the card to be removed from the player's hand
     * @return Card - the card that was removed from the player's hand
     */
    public Card remove(Card c) {
        Card temp = cards.get(cards.indexOf(c));
        cards.remove(temp);
        return temp;
    }

    /**
     * @desc Check if the player's hand contains a certain card
     * @param c - the card to be tested if exists in the player's hand
     * @return boolean - card exists in the player's hand or does not exist
     */
    public boolean contains(Card c) {
        return cards.contains(c);
    }

    /**
     * @desc Sorts the player's hand in ascending order
     */
    public void sort() {
        Collections.sort(cards);
    }
}
