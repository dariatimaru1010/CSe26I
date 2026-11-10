package sea.dal;

import sea.be.GameResult;

import java.util.List;

public interface IGameResultDAO {
    public void add(GameResult gr);
    public List<GameResult> getResults();
}
