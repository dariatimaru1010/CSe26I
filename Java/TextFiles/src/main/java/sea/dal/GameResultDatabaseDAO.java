package sea.dal;

import sea.be.GameResult;

import java.util.List;

public class GameResultDatabaseDAO implements IGameResultDAO{
    // Fake database class
    @Override
    public void add(GameResult gr) {

    }

    @Override
    public List<GameResult> getResults() {
        return List.of(new GameResult[]{new GameResult(0,"Bob", "Bo", "draw")});
    }
}
