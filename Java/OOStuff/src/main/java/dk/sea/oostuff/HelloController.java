package dk.sea.oostuff;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public Label getWelcomeTextLabel(){
        return welcomeText;
    }

    public void setWelcomeTextLabel(Label label){
        welcomeText = label;
    }
}
