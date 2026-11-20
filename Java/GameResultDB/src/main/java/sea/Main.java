package sea;

import sea.be.GameResult;
import sea.dal.ResultDAO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ResultDAO gr = new ResultDAO();
        //List<GameResult> results = gr.loadAll();
        //printResults(results);
        //printResults(gr.findByPlayer("Tarzan"));
        GameResult sponge = new GameResult("Tarzan", "Spiderman", "Tarzan");
        GameResult newSponge = null;
        try {
            newSponge = gr.save(sponge);
            System.out.println(sponge.getId());
            System.out.println(newSponge.getId());
            printResults(gr.findByPlayer("Tarzan"));
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
