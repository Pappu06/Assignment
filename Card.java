package com.Carddeck;

//The Card class represents a single playing card with a suit and rank.
public class Card {
	
	 // The Suit enum defines the four possible suits of a card.
    enum Suit {
        SPADE, CLUB, HEART, DIAMOND
    }

     // The Rank enum defines the thirteen possible ranks of a card.
    enum Rank {
        A, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K
    }

    // Private member variables to store the suit and rank of the card.
    private Suit suit;
    private Rank rank;

    // Constructor to initialize the suit and rank of the card.
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter method for the suit of the card.
    public Suit getSuit() {
        return suit;
    }

    // Getter method for the rank of the card.
    public Rank getRank() {
        return rank;
    }

    // Overriding the toString method to return a string representation of the card.
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

