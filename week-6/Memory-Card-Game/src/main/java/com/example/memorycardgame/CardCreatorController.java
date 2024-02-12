package com.example.memorycardgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class CardCreatorController implements Initializable {
    @FXML
    private TextField faceNameTextField;

    @FXML
    private ImageView imageView;

    @FXML
    private Label label;

    @FXML
    private ComboBox<String> suitComboBox;

    @FXML
    void createCard(ActionEvent event) {
        String faceName = faceNameTextField.getText();
        String suit = suitComboBox.getValue();
        label.setText(faceName + " of " + suit);

        if (suit == null) {
            label.setText("Please select a suit.");
        } else {
            try {
                Card card = new Card(suit, faceName);
                imageView.setImage(card.getImage());
            } catch (IllegalArgumentException e) {
                label.setText(e.getMessage());
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        suitComboBox.getItems().addAll(Card.getValidSuits());
    }
}
