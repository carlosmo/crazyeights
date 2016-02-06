//package com.crazyeights;

/**
 * Created by carlosmo on 2016-01-31.
 *
 * @desc Represention of a computer AI player
 */
public class ComputerPlayer extends Player {

    /**
     * @desc ComputerPlayer constructor
     * @param name - the name of the computer player
     */
    ComputerPlayer(String name) {
        super(name);
    }

    /**
     * @desc Attempts to locate a playable card in the computer player's hand
     * @param activeSuit - the current suit in play
     * @param rank - the current rank in play
     * @return Card - a playable Card object, or null if no playable cards can be found
     */
    public Card findPlayableCard(Suit activeSuit, Rank rank) {
        for (Card c : hand.cards) {
            if (c.isCrazyEight() || c.suit == activeSuit || c.rank == rank) {
                return c;
            }
        }

        return null;
    }

    /**
     * @desc Determines the move that the computer player will make during its turn
     * @param deck - the current deck of cards
     * @param playPile - the current pile of cards that are in play
     */
    @Override
    public void move(Deck deck, Pile playPile) {
        String hr = "\n*************************************************\n";
        System.out.print(hr);

        // Determine the currently active suit
        Suit activeSuit;
        if(playPile.topCard().isCrazyEight()) {
            activeSuit = ((CrazyEightCard) playPile.topCard()).declared;
        }
        else {
            activeSuit = playPile.topCard().suit;
        }

        // Attempt to find a playable card
        Card playableCard = null;
        playableCard = findPlayableCard(activeSuit, playPile.topCard().rank);

        // If no playable card was find, draw cards to find a playable card
        int drawCount = 0;
        while (playableCard == null && drawCount < 3) {
            if (deck.size() == 0) {
                reshuffleDeck(deck, playPile);
                System.out.println(name + " reshuffled the deck.");
            }

            draw(deck, 1);
            System.out.println(name + " drew a card.");
            drawCount++;
            playableCard = findPlayableCard(activeSuit, playPile.topCard().rank);
        }

        // Skip turn if no playable card was found, even after the max draw count was reached
        if (playableCard == null && drawCount == 3) {
            System.out.println(name + " skipped their turn.");
        }
        else {
            // Play a valid card
            hand.remove(playableCard);
            playPile.addCard(playableCard);
            System.out.println(name + " played a " + playableCard);

            // Declare a suit if a crazy eight is played
            if (playableCard.isCrazyEight()) {
                System.out.println(name + " declared " + ((CrazyEightCard) playableCard).declared + " as the active suit.");
            }
        }

        System.out.print(hr);
    }
}
