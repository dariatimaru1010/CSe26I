package sea.be;

public class GameResult {
    private int id;
    private String playerX;
    private String playerO;
    private String winner;
    public GameResult(int id, String playerX, String playerO, String winner) {
        this.id = id;
        this.playerX = playerX;
        this.playerO = playerO;
        this.winner = winner;
    }
    public GameResult(String playerX, String playerO, String winner) {
        this(0, playerX, playerO, winner);
    }
    public int getId() { return id; }
    public String getPlayerX() { return playerX; }
    public String getPlayerO() { return playerO; }
    public String getWinner() { return winner; }
}
