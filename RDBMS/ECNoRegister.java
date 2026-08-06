import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnectionNoRegister {
    public static void main(String[] args) {
        // TODO: update these to match your Oracle instance
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "your_username";
        String password = "your_password";

        Connection connection = null;

        try {
            // Class.forName("oracle.jdbc.driver.OracleDriver"); // registration commented out

            connection = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Established successfully");

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.out.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
}
