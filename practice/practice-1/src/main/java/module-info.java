module com.example.practice1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.example.practice1 to javafx.fxml;
    exports com.example.practice1;
}