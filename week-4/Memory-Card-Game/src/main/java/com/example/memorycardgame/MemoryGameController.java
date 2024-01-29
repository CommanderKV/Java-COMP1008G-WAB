package com.example.memorycardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;

public class MemoryGameController implements Initializable {

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

        for (int i=0; i < cardFlowPane.getChildren().size()/2; i++) {
            Card cardDealt = deck.dealTopCard();
            cardsInGame.add(new MemoryCard(cardDealt.getSuit(), cardDealt.getFaceName()));
            cardsInGame.add(new MemoryCard(cardDealt.getSuit(), cardDealt.getFaceName()));
        }
        Collections.shuffle(cardsInGame);
        flipAllCards();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private void initializeImageView() {
        ImageView imageView = cardFlowPlane.getChildren().get(i);
    }


}
