package com.example.practice1;

import com.example.practice1.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.*;

public class HelloController implements Initializable {

    @FXML
    private TextField InputField1;

    @FXML
    private TextField InputField2;

    @FXML
    private TextField InputField3;

    @FXML
    private ImageView imageView1;

    @FXML
    private ImageView imageView2;

    @FXML
    private ImageView imageView3;

    @FXML
    private Button updateButton;

    @FXML
    void updateCards(ActionEvent event) {
        List<ImageView> images = Arrays.asList(imageView1, imageView2, imageView3);
        List<TextField> textFields = Arrays.asList(InputField1, InputField2, InputField3);

        List<String> processedInputs = processInputs(textFields);
        updateImages(images, processedInputs);
    }

    private List<String> processInputs(List<TextField> inputText) {
        List<String> cards = Arrays.asList(
                "ace of hearts",
                "2 of hearts",
                "3 of hearts",
                "4 of hearts",
                "5 of hearts",
                "6 of hearts",
                "7 of hearts",
                "8 of hearts",
                "9 of hearts",
                "10 of hearts",
                "jack of hearts",
                "queen of hearts",
                "king of hearts",

                "ace of diamonds",
                "2 of diamonds",
                "3 of diamonds",
                "4 of diamonds",
                "5 of diamonds",
                "6 of diamonds",
                "7 of diamonds",
                "8 of diamonds",
                "9 of diamonds",
                "10 of diamonds",
                "jack of diamonds",
                "queen of diamonds",
                "king of diamonds",

                "ace of spades",
                "2 of spades",
                "3 of spades",
                "4 of spades",
                "5 of spades",
                "6 of spades",
                "7 of spades",
                "8 of spades",
                "9 of spades",
                "10 of spades",
                "jack of spades",
                "queen of spades",
                "king of spades",

                "ace of clubs",
                "2 of clubs",
                "3 of clubs",
                "4 of clubs",
                "5 of clubs",
                "6 of clubs",
                "7 of clubs",
                "8 of clubs",
                "9 of clubs",
                "10 of clubs",
                "jack of clubs",
                "queen of clubs",
                "king of clubs"
        );

        List<String> results = new ArrayList<>();

        for (TextField textField : inputText) {
            String text = textField.getText();
            if (cards.contains(text)) {
                results.add(text);
            } else {
                results.add("Not found");
            }
        }

        return results;
    }

    private void updateImages(List<ImageView> images, List<String> inputs) {
        for (int i=0; i< inputs.size(); i++) {
            if (!inputs.get(i).equals("Not found")) {
                String path = "imgs/"+inputs.get(i).replace(" ", "_")+".png";
                Image newImage = new Image(HelloController.class.getResourceAsStream(path));
                images.get(i).setImage(newImage);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

}
