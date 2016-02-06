//package com.crazyeights;


/**
 * Created by carlosmo on 2016-01-30.
 *
 * @desc Representation of a card in a deck
 */
public class Card implements Comparable<Card>{
    Suit suit;
    Rank rank;

    /**
     * @desc Card constructor
     * @param s - the suit of instantiated object
     * @param r - the rank of instantiated object
     */
    Card (Suit s, Rank r) {
        suit = s;
        rank = r;
    }

    /**
     * @desc Determines equivalency between cards
     * @param o - object to tested for equivalency
     * @return boolean - equivalent or inequivalent
     */
    public boolean equals(Object o) {
        if(!(o instanceof Card)) return false;

        Card card = (Card) o;

        return (suit == card.suit && rank == card.rank);
    }

    /**
     * @desc Determines if this card is a crazy eight card
     * @return boolean - is instance of a CrazyEightCard or not
     */
    public boolean isCrazyEight() {
        return this instanceof CrazyEightCard;
    }

    /**
     * @desc Compares two cards by first suit, then rank
     * @param c - object to compared to
     * @return int - negative if this object < c, zero if this object == c, positive if this object > c
     */
    @Override
    public int compareTo (Card c) {
        int suitCom = suit.compareTo(c.suit);
        return suitCom != 0 ? suitCom : rank.compareTo(c.rank);
    }

    /**
     * @desc Prints the rank and suit of the card
     */
    public void display() {
        System.out.println(rank + " of " + suit);
    }

    /**
     * @desc Overrides the toString method to print the rank and suit the card
     * @return String - the message to be displayed
     */
    public String toString() {
        return rank + " of " + suit;
    }
}
