package sea.be;

public class GameResult {
    private int gameNumber;
    private String player1;
    private String player2;
    private String winner;

    public GameResult(int gameNumber, String player1, String player2, String winner){
        this.gameNumber = gameNumber;
        this.player1 = player1;
        this.player2 = player2;
        this.winner  = winner;
    }

    public int getGameNumber(){
        return gameNumber;
    }
    public String getPlayer1(){
        return player1;
    }
    public String getPlayer2(){
        return player2;
    }
    public String getWinner(){
        return winner;
    }

}
