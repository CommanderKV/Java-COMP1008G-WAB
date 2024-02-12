package com.example.memorycardgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("memory-game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Memory loader");
        stage.setScene(scene);
        stage.show();
    }
}