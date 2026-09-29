package dk.sea.questionaire;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class QuestionWindowController {
    @FXML
    private Label lblName;

    MainWindowController mwc;

    public void setMainController(MainWindowController mwc){
        this.mwc = mwc;
    }
    public void setName(String name){
        lblName.setText(name);
    }

}
