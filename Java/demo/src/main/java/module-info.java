module dk.sea.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.sea.demo to javafx.fxml;
    exports dk.sea.demo;
}