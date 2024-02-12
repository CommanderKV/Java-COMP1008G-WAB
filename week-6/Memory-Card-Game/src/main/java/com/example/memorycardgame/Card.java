package com.example.memorycardgame;

import javafx.scene.image.Image;

import java.util.Arrays;
import java.util.List;

public class Card {
    private String suit, faceName;

    /**
     * This constructor will take in the suit of
     * the card and the face name of a card.
     *
     * @param suit     "Hearts", "Diamonds", "Spades", "Clubs"
     * @param faceName "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
     */
    public Card(String suit, String faceName) {
        setSuit(suit);
        setFaceName(faceName);
    }

    /**
     * This method will return the color of the suit
     * Red for diamonds and hearts,
     * black for clubs and spades
     * @return "red" or "black"
     */
    public String getColor() {
        if (suit.equals("diamonds") || suit.equals("hearts")) {
            return "red";
        } else {
            return "black";
        }
    }

    /**
     * index ->     0,    1,    2,    3,    4,    5,    6,    7,     8,     9,      10,      11,     12
     * faceName ->  2,    3,    4,    5,    6,    7,    8,    9,     10,    "Jack", "Queen", "King", "Ace"
     * Value ->     2     3     4     5     6     7     8     9      10     11      12       13      14
     * @return
     */
    public int getValue() {
        List<String> faceNames = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace");
        return faceNames.indexOf(faceName)+2;
    }



    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        suit = suit.toLowerCase();
        // Check for the final position of the string
        if (suit.charAt(suit.length()-1) != 's') {
            suit = suit + "s";
        }
        // Validate that the suit is Hearts, Diamonds, Spades, or Clubs
        List<String> validSuits = getValidSuits();

        // Test if the argument is in  the list of valid suits
        if (validSuits.contains(suit)) {
            this.suit = suit;
        } else {
            throw new IllegalArgumentException(suit + " is not valid, choose from: " + validSuits);
        }
    }

    /**
     * Get the valid suits
     * @return List<String> Suits
     */
    public static List<String> getValidSuits() {
        return Arrays.asList("hearts", "diamonds", "spades", "clubs");
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();

        faceName = faceName.toLowerCase();
        if (validFaceNames.contains(faceName))
            this.faceName = faceName;

        else
            throw new IllegalArgumentException(faceName + " is not valid, choose from: " + validFaceNames);
    }

    /**
     * Get valid face names for the cards
     * @return List<String> validFaceNames
     */
    public static List<String> getValidFaceNames() {
        return Arrays.asList(
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9",
                "10",
                "jack",
                "queen",
                "king",
                "ace"
        );
    }

    /**
     * This will return the face name and suit
     * @return facename of suit
     */
    @Override
    public String toString() {
        return faceName + " of " + suit;
    }


    /**
     * This method returns an Image object to represent the Card
     */
    public Image getImage() {
        String imageName = "imgs/" + faceName + "_of_" + suit + ".png";
        return new Image(Card.class.getResourceAsStream(imageName));
    }

    public Image getBackOfCardImage() {
        return new Image(Card.class.getResourceAsStream("imgs/back_of_card.png"));
    }

}
