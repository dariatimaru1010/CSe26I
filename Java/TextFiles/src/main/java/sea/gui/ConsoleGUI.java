package sea.gui;

import sea.be.GameResult;
import sea.bll.BLLManager;

import java.util.List;

public class ConsoleGUI {
    public void startGUI(){
        BLLManager bll = new BLLManager();
        List<GameResult> results = bll.getResults();
        for(GameResult gr : results){
            printGameResult(gr);
        }

        GameResult gr = new GameResult(0, "Bobby", "Peter", "draw");
        bll.saveGameResults(gr);

        List<GameResult> results2 = bll.getResults();
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
