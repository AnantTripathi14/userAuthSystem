package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/user_auth";
        String username = "root";
        String password = "Anant10Tripathi";
        return DriverManager.getConnection(url, username, password);
    }
}
