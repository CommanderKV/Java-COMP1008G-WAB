module org.example.w24comp1008lhw9 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.w24comp1008lhw9 to javafx.fxml;
    exports org.example.w24comp1008lhw9;
}