package com.Carddeck;

import java.util.Collections;
import java.util.List;

//The Main class contains the main method to demonstrate the functionality of the Deck and Card classes.
public class Main {
	// The main method is the entry point of the program.
    public static void main(String[] args) {
    	 // Create a new deck of cards.
        Deck deck = new Deck();
        // Shuffle the deck.
        deck.shuffle();

        // Draw 20 cards from the deck.
        List<Card> drawnCards = deck.drawMultipleCards(20);
        // Print the drawn cards.
        System.out.println("Drawn Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }

        // Sort the drawn cards using the CardComparator.
        Collections.sort(drawnCards, new CardComparator());
        // Print the sorted cards.
        System.out.println("\nSorted Cards:");
        for (Card card : drawnCards) {
            System.out.println(card);
        }
    }
}
