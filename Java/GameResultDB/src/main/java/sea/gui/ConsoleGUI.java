package sea.gui;

import sea.bll.ResultManager;
import sea.util.GameResultException;
import sea.be.GameResult;
import sea.dal.ResultDAO;

import java.util.List;

public class ConsoleGUI {
    public void start() {
        ResultManager rm = new ResultManager();
        //List<GameResult> results = gr.loadAll();
        //printResults(results);
        //printResults(gr.findByPlayer("Tarzan"));
        GameResult sponge = new GameResult("Svennild", "Thor", "Thor");
        GameResult newSponge = null;
        try {
            newSponge = rm.save(sponge);
            System.out.println(sponge.getId());
            System.out.println(newSponge.getId());
            printResults(rm.findByPlayer("Thor"));
        } catch (GameResultException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void printResults(List<GameResult> results) {
        for (GameResult result : results) {
            System.out.println(result.getId() + ": " + result.getPlayerX() + " vs "
                    + result.getPlayerO() + " - winner: " + result.getWinner());
        }
    }
}
