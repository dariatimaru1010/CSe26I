package sea.gui;

import javafx.scene.control.Alert;
import sea.be.GameResult;
import sea.bll.BLLManager;
import sea.util.GameResultException;

import java.io.FileNotFoundException;
import java.util.List;

public class ConsoleGUI {
    public void startGUI(){
        BLLManager bll = new BLLManager();
        List<GameResult> results = null;
        try {
            results = bll.getResults();
        } catch (GameResultException e) {
            System.out.println(e);
        }
        for(GameResult gr : results){
            printGameResult(gr);
        }

        GameResult gr = new GameResult(0, "Bobby", "Peter", "draw");
        bll.saveGameResults(gr);

        List<GameResult> results2 = null;
        try {
            results2 = bll.getResults();
        } catch (GameResultException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR,"File not found   |  " + e);
            alert.show();
        }

        for(GameResult gr2 : results2){
            printGameResult(gr2);
        }
    }
    public static void printGameResult(GameResult gr){
        System.out.println("Game #" + gr.getGameNumber());
        System.out.println("First player: " + gr.getPlayer1());
        System.out.println("Second player: "  + gr.getPlayer2());
        System.out.println("Winner: "  + gr.getWinner());
        System.out.println("##################");
    }
}
