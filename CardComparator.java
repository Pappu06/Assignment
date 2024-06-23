package com.Carddeck;

import java.util.Comparator;

//The CardComparator class implements the Comparator interface to compare Card objects.
public class CardComparator implements Comparator<Card> {
	
	// Override the compare method to define the comparison logic for Card objects.
    @Override
    public int compare(Card c1, Card c2) {
    	 // Get the color values of the suits of the two cards.
        int color1 = getColorValue(c1.getSuit());
        int color2 = getColorValue(c2.getSuit());

     // Compare the color values; if they are different, return the difference.
        if (color1 != color2) {
            return color1 - color2;
        }

     // If the color values are the same, compare the suit values.
        int suit1 = getSuitValue(c1.getSuit());
        int suit2 = getSuitValue(c2.getSuit());

        // If the suit values are different, return the difference.
        if (suit1 != suit2) {
            return suit1 - suit2;
        }

        // If the suit values are the same, compare the rank values and return the difference.
        return getRankValue(c1.getRank()) - getRankValue(c2.getRank());
    }

    // Helper method to get the color value of a suit.
    private int getColorValue(Card.Suit suit) {
        switch (suit) {
            case HEART:
            case DIAMOND:
                return 1; // Red suits
            case SPADE:
            case CLUB:
                return 0; // Black suits
        }
        return -1; // This should never happen
    }

    // Helper method to get the suit value for comparison.
    private int getSuitValue(Card.Suit suit) {
        switch (suit) {
            case HEART:
                return 2; // Arbitrary value for HEART
            case DIAMOND:
                return 3; // Arbitrary value for DIAMOND
            case SPADE:
                return 0; // Arbitrary value for SPADE
            case CLUB:
                return 1; // Arbitrary value for CLUB
        }
        return -1; // This should never happen
    }

    // Helper method to get the rank value for comparison.
    private int getRankValue(Card.Rank rank) {
        switch (rank) {
            case A:
                return 1; // Value for Ace
            case TWO:
                return 2; // Value for Two
            case THREE:
                return 3; // Value for Three
            case FOUR:
                return 4; // Value for Four
            case FIVE:
                return 5; // Value for Five
            case SIX:
                return 6; // Value for Six
            case SEVEN:
                return 7; // Value for Seven
            case EIGHT:
                return 8; // Value for Eight
            case NINE:
                return 9; // Value for Nine
            case TEN:
                return 10; // Value for Ten
            case J:
                return 11; // Value for Jack
            case Q:
                return 12; // Value for Queen
            case K:
                return 13; // Value for King
        }
        return -1; // This should never happen
    }
}

