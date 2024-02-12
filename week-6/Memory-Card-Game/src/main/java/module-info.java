module com.example.memorycardgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.memorycardgame to javafx.fxml;
    exports com.example.memorycardgame;
}