package sea.dal;

import sea.be.GameResult;
import sea.util.GameResultException;

import java.io.FileNotFoundException;
import java.util.List;

public interface IGameResultDAO {
    public void add(GameResult gr);
    public List<GameResult> getResults() throws GameResultException;
}
