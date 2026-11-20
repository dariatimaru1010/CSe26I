package sea.bll;

import sea.be.GameResult;
import sea.dal.ResultDAO;
import sea.util.GameResultException;

import java.util.List;

public class ResultManager {
    ResultDAO rdao = new ResultDAO();
    public GameResult save(GameResult gr) throws GameResultException {
        return rdao.save(gr);
    }

    public List<GameResult> findByPlayer(String player) throws GameResultException {
        return rdao.findByPlayer(player);
    }
}
