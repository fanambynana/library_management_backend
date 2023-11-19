package management.library.bdConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public Connection createConnection() {
        try {
            return DriverManager.getConnection(
                    PsqlConf.URL,
                    PsqlConf.USERNAME,
                    PsqlConf.PASSWORD
            );
        } catch (SQLException exception) {
            System.out.println("Connection error :\n" + exception.getMessage());
            return null;
        }
    }
}
