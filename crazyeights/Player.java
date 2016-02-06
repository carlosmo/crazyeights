//package com.crazyeights;

/**
 * Created by carlosmo on 2016-01-31.
 *
 * @desc Representation of a generic player
 */
public abstract class Player {
    Hand hand;
    String name;

    /**
     * @desc Player constructor
     * @param n - the name of the player
     */
    Player(String n) {
        hand = new Hand();
        name = n;
    }

    /**
     * @desc Draws cards from the deck
     * @param deck - the deck to be drawn from
     * @param numCards - the number of cards to draw
     */
    public void draw(Deck deck, int numCards) {
        for (int i = 0; i < numCards; i++) {
            hand.addCard(deck.removeTopCard());
        }
    }

    /**
     * @desc Reshuffles the deck by taking all but the top card from the play pile and integrating them back into the deck
     * @param deck - the current deck of cards
     * @param playPile - the current pile of cards that are in play
     */
    public void reshuffleDeck(Deck deck, Pile playPile) {
        for (int i=0; i < playPile.size()-1; i++) {
            deck.addCard(playPile.cards.remove(i));
        }

        deck.shuffle();
    }

    /**
     * @desc Checks if the player has won.  A player wins when they have no more cards in their hand.
     * @return boolean - the player has won or not
     */
    public boolean win() {
        if (hand.size() == 0) return true;
        else return false;
    }

    /**
     * @desc The move that a player makes during their turn.  To be defined by subclasses.
     * @param deck - the current deck of cards
     * @param playPile - the current pile of cards that are in play
     */
    public abstract void move(Deck deck, Pile playPile);
}