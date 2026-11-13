package sea.bll;

import sea.be.GameResult;
import sea.dal.GameResultDAO;
import sea.dal.GameResultDatabaseDAO;
import sea.dal.IGameResultDAO;

import java.util.List;

public class BLLManager {
    private final IGameResultDAO grdao = new GameResultDatabaseDAO();

    public List<GameResult> getResults() {
        return grdao.getResults();
    }

    public void saveGameResults(GameResult gr) {
        String delimiter = ";";
        if(     gr.getPlayer1().contains(delimiter) ||
                gr.getPlayer2().contains(delimiter) ||
                gr.getWinner().contains(delimiter))
        {
            throw new RuntimeException("Cannot add player with ; in name");
        }
        else
            grdao.add(gr);
    }
}
