package sea.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import sea.util.GameResultException;
import sea.be.GameResult;
import sea.bll.BLLManager;

import java.util.ArrayList;
import java.util.List;

public class GameResultController {
    @FXML
    private ListView<GameResult> listResults;

    BLLManager bll = new BLLManager();

    @FXML
    private void clickFetch(ActionEvent actionEvent)  {
        List<GameResult> results = new ArrayList();
        try {
            results = bll.getResults();
        } catch (GameResultException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "File problem " + e);
            alert.show();
        }
        listResults.getItems().addAll(results);

    }
}
