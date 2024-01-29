package com.example.memorycardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import java.util.ArrayList;

public class MemoryGameController {

    @FXML
    private Label CorrectGuessesLabel;

    @FXML
    private Label GuessesLabel;

    @FXML
    private FlowPane cardFlowPane;


    private ArrayList<MemoryCard> cardsInGame;
    private MemoryCard firstCard, secondCard;
    private int numOfGuesses;
    private int numOfMatches;

    @FXML
    void resetButton(ActionEvent event) {
        firstCard = null;
        secondCard = null;

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        cardsInGame = new ArrayList<>();

        for (int i=0; i < cardFlowPane.getChildren()/2; i++) {

        }
    }

}
