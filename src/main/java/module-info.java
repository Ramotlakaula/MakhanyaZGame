module com.example.makhanyazgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.makhanyazgame to javafx.fxml;
    exports com.example.makhanyazgame;
}