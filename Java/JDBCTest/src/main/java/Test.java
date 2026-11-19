import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setServerName("EASV-DB4");
        ds.setPortNumber(1433);
        ds.setDatabaseName("CS2026b_e_24_TicTacToe");
        ds.setUser("CS2026b_e_24");
        ds.setPassword("CS2026bE24#26");
        ds.setTrustServerCertificate(true);
        String sql = "SELECT winner FROM GameResult where id=3";
        try (Connection con = ds.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                System.out.println(rs.getString("winner"));
                    /*
                    System.out.println(rs.getInt("Id") +
                            ": " + rs.getString("PlayerX") +
                            " vs " + rs.getString("PlayerO") +
                            " - winner: " + rs.getString("Winner"));*/
            }
        }
    }

}
