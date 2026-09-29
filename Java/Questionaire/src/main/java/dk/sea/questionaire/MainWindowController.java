package dk.sea.questionaire;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    @FXML
    private TextField txtName;

    public void someRemoteMethod(){
        // does nothing
    }
    @FXML
    private void clickFillQuestionaire(ActionEvent actionEvent) throws IOException {
        //name = txtName.getText();
        System.out.println("it works, maybe?");
        FXMLLoader fxmlLoader = new FXMLLoader(MainWindowController.class.getResource("QuestionWindow.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Questions?");
        stage.setScene(scene);

        QuestionWindowController qwc = fxmlLoader.getController();
        qwc.setName(txtName.getText());
        qwc.setMainController(this);
        stage.show();
    }
}
