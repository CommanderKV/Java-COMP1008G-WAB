package com.example.memorycardgame;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<com.example.memorycardgame.Card> deck;

    /**
     * This is a constructor that will generate a deck of 52 cards.
     * They will be stored in the ArrayList called "deck".
     */
    public DeckOfCards() {
        deck = new ArrayList<>();

        List<String> suits = com.example.memorycardgame.Card.getValidSuits();
        List<String> faceNames = com.example.memorycardgame.Card.getValidFaceNames();

        // Builds the card objects and puts them into the deck
        for (int i=0; i < suits.size(); i++) {
            for (int j=0; j < faceNames.size(); j++) {
                deck.add(new com.example.memorycardgame.Card(suits.get(i), faceNames.get(j)));
            }
        }

    }


    public com.example.memorycardgame.Card dealTopCard() {
        if (deck.size() > 0) {
            return deck.remove(0);
        }
        return null;
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

}
