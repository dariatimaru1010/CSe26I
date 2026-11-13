package sea.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import sea.be.GameResult;
import sea.bll.BLLManager;

import java.util.List;

public class GameResultController {
    @FXML
    private ListView<GameResult> listResults;

    BLLManager bll = new BLLManager();

    @FXML
    private void clickFetch(ActionEvent actionEvent) {
        List<GameResult> results = bll.getResults();
        listResults.getItems().addAll(results);

    }
}
