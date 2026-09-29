package dk.sea.javafxfirst;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void jeppeAction(ActionEvent actionEvent) {
        System.out.println("Mooooo!");
        welcomeText.setText("I am a COW! Moooo!");
    }
}
