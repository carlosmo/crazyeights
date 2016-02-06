//package com.crazyeights;

/**
 * Created by carlosmo on 2016-02-04.
 *
 * @desc Representation of a crazy eight card
 */
public class CrazyEightCard extends Card {
    Suit declared;


    /**
     * @desc CrazyEightCard constructor
     * @param s - the suit of the instantiated object
     * @param r - the rank of the instantiated object
     */
    CrazyEightCard(Suit s, Rank r) {
        super(s,r);
        declared = s;
    }

    /**
     * @desc Declares an active suit with a crazy eight is played
     * @param s - the suit to be declared as active
     */
    public void declareSuit(Suit s) {
        declared = s;
    }

}
