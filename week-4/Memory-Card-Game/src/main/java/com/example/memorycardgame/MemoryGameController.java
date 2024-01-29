package com.example.memorycardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
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

    /**
     * This will add a number to each imageView and set
     * the image to the back of the card
     */
    private void initializeImageView() {
        for (int i=0; i < cardFlowPane.getChildren().size(); i++) {
            ImageView imageView = (ImageView) cardFlowPane.getChildren().get(i);
            imageView.setImage(new Image(Card.class.getResourceAsStream("imgs/back_of_card.png")));
            imageView.setUserData(i);

            // Register an event listener for clicks
            imageView.setOnMouseClicked(event -> {
                flipCard((int) imageView.getUserData());
            });
        }
    }


    /**
     * This will show the back of
     * all cards that are not matched
     */
    private void flipAllCards() {
        for (int i=0; i<cardsInGame.size(); i++) {
            ImageView imageView = (ImageView) cardFlowPane.getChildren().get(i);
            MemoryCard card = cardsInGame.get(i);

            if (card.isMatched()) {
                imageView.setImage(card.getImage());
            } else {
                imageView.setImage(card.getBackOfCardImage());
            }
        }

    }

    private void flipCard(int indexOfCard) {
        if (firstCard == null && secondCard == null) {
            flipAllCards();
        }

        ImageView imageView = (ImageView) cardFlowPane.getChildren().get(indexOfCard);

        if (firstCard == null) {
            firstCard = cardsInGame.get(indexOfCard);
            imageView.setImage(firstCard.getImage());
        } else if (secondCard == null) {
            secondCard = cardsInGame.get(indexOfCard);
            imageView.setImage(secondCard.getImage());
        }]


    }

}
