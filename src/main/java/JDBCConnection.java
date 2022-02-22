import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection( Access.Url, Access.User, Access.Password);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        if (connection.isValid(1)){
            System.out.println("Connection success!\nConnection = not null");
        }
        return connection;
    }
}
