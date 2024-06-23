package com.Carddeck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//The Deck class represents a deck of playing cards.
public class Deck {
	
	 // A list to store the cards in the deck.
    private List<Card> cards;

    // Constructor to initialize the deck with 52 cards.
    public Deck() {
        cards = new ArrayList<>();
        
        // Loop through each suit.
        for (Card.Suit suit : Card.Suit.values()) {
        	 // Loop through each rank.
            for (Card.Rank rank : Card.Rank.values()) {
            	  // Add a new card with the current suit and rank to the deck.
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Method to shuffle the deck of cards.
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Method to draw a single card from the top of the deck.
    public Card drawCard() {
    	// Check if the deck is empty.
        if (cards.isEmpty()) {
            return null; // Return null if no cards are left.
        }
        // Remove and return the top card from the deck.
        return cards.remove(0);
    }

    // Method to draw multiple cards from the top of the deck.
    public List<Card> drawMultipleCards(int numberOfCards) {
    	// List to store the drawn cards.
        List<Card> drawnCards = new ArrayList<>();
        // Draw the specified number of cards.
        for (int i = 0; i < numberOfCards; i++) {
        	 // Draw a single card.
            Card card = drawCard();
            // Check if a card was successfully drawn.
            if (card != null) {
            	 // Add the drawn card to the list.
                drawnCards.add(card);
            }
        }
     // Return the list of drawn cards.
        return drawnCards;
    }
}

