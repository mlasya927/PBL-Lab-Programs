import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class QueryEmpTable {
    public static void main(String[] args) {
        // TODO: update these to match your Oracle instance
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "your_username";
        String password = "your_password";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            statement = connection.createStatement();
            String query = "SELECT * FROM emp";
            resultSet = statement.executeQuery(query);

            System.out.println("EMPNO\tENAME");
            while (resultSet.next()) {
                int empno = resultSet.getInt(1);        // column index
                String ename = resultSet.getString("ename"); // column name
                System.out.println(empno + "\t" + ename);
            }

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
