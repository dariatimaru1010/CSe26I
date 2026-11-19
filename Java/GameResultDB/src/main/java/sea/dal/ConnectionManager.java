package sea.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import sea.GameResultException;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
    private final SQLServerDataSource ds = new SQLServerDataSource();
    public ConnectionManager() {
        ds.setServerName("EASV-DB4");
        ds.setPortNumber(1433);
        ds.setDatabaseName("CS2026b_e_24_TicTacToe");
        ds.setUser("CS2026b_e_24");
        ds.setPassword("CS2026bE24#26");
        ds.setTrustServerCertificate(true);
    }
    public Connection getConnection() throws GameResultException {
        try {
            return ds.getConnection();
        }
        catch(SQLServerException sse ){
            throw new GameResultException("Problem with the sql server", sse);
        }
    }

}
