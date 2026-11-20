package sea.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameResultFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
                this.getClass().getResource(
                        "/sea/gui/GameResultView.fxml"));

        primaryStage.setScene(new Scene(loader.load()));
        primaryStage.show();
    }
}
