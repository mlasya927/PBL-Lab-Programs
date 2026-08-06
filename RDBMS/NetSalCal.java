import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Types;

public class NetSalaryCalculator {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String username = "your_username";
        String password = "your_password";

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        CallableStatement callableStatement = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection Established successfully");

            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT empno FROM emp");

            callableStatement = connection.prepareCall("{call get_net_salary(?, ?, ?)}");

            System.out.println("EMPNO\tENAME\t\tNET SALARY");
            while (resultSet.next()) {
                int empno = resultSet.getInt("empno");

                callableStatement.setInt(1, empno);
                callableStatement.registerOutParameter(2, Types.VARCHAR);
                callableStatement.registerOutParameter(3, Types.NUMERIC);

                callableStatement.execute();

                String ename = callableStatement.getString(2);
                double netSalary = callableStatement.getDouble(3);

                System.out.println(empno + "\t" + ename + "\t\t" + netSalary);
            }

        } catch (Exception e) {
            System.out.println("Connection could not be established");
            System.out.println("Exception: " + e.getMessage());
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (callableStatement != null) callableStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
