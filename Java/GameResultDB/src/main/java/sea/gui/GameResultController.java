package sea.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sea.be.GameResult;
import sea.bll.ResultManager;
import sea.util.GameResultException;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class GameResultController implements Initializable {
    @FXML
    private TableView<GameResult> tableResults;
    @FXML
    private TableColumn colId;
    @FXML
    private TableColumn colPX;
    @FXML
    private TableColumn colPO;
    @FXML
    private TableColumn colWin;

    private ResultManager rm = new ResultManager();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colPX.setCellValueFactory(new PropertyValueFactory<>("playerX"));
        colPO.setCellValueFactory(new PropertyValueFactory<>("playerO"));
        colWin.setCellValueFactory(new PropertyValueFactory<>("winner"));
        fetchData();
    }

    public void clickFetch(ActionEvent actionEvent) {
        fetchData();
    }

    private void fetchData(){
        try {
            List<GameResult> results = rm.findByPlayer("Alice");
            tableResults.getItems().clear();
            tableResults.getItems().addAll(results);
        } catch (GameResultException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage());
            alert.show();
        }
    }


}
