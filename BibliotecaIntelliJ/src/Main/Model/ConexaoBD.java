package Main.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    public static Connection ConexaoBD() throws SQLException, ClassNotFoundException {

        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "devs", "password123");

        return connection;
    }
}