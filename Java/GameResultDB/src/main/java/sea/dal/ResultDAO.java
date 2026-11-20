package sea.dal;

import sea.util.GameResultException;
import sea.be.GameResult;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ResultDAO {
    private final ConnectionManager cm = new ConnectionManager();

    public GameResult save(GameResult gr) throws GameResultException {
        String sql = "INSERT INTO GameResult (PlayerX, PlayerO, Winner) VALUES (?, ?, ?);";
        try(Connection con = cm.getConnection()){
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, gr.getPlayerX());
            stmt.setString(2, gr.getPlayerO());
            stmt.setString(3, gr.getWinner());
            stmt.executeUpdate();
            try (ResultSet keys = stmt.getGeneratedKeys() ) {
                keys.next();
                int id = keys.getInt(1);
                return new GameResult(id, gr.getPlayerX(), gr.getPlayerO(), gr.getWinner());
            }

        } catch (SQLException e) {
            throw new GameResultException("Problems with saving to db",e);
        }
    }

    public List<GameResult> loadAll() throws GameResultException {
        List<GameResult> results = new ArrayList();
        String sql = "SELECT * FROM GameResult";

        try(Connection con = cm.getConnection();
            PreparedStatement stmt = con.prepareStatement(sql);) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("Id");
                String playerX = rs.getString("PlayerX");
                String playerO = rs.getString("PlayerO");
                String winner = rs.getString("winner");
                GameResult gr = createResult(rs);
                results.add(gr);
            }
        } catch (SQLException e) {
            throw new GameResultException("Problems with loading all rows from db",e);
        }
        return results;
    }

    public List<GameResult> findByPlayer(String name) throws GameResultException {
        List<GameResult> results = new ArrayList<>();
        String sql = "SELECT * FROM GameResult WHERE PlayerX = ? OR PlayerO = ?";
        try (Connection con = cm.getConnection();
             ) {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,name);
            stmt.setString(2,name);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                results.add(createResult(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GameResultException("Problems fetching player from db",e);

        }
        return results;
    }

    private GameResult createResult(ResultSet rs) throws SQLException {
        return new GameResult(rs.getInt("Id"), rs.getString("PlayerX"),
                rs.getString("PlayerO"), rs.getString("Winner"));
    }
}
