import java.sql.*;

class MyConnection {

    private MyConnection() {}

    private static Connection conn;

    public static Connection getConnection(String dataBaseName)
            throws ClassNotFoundException, SQLException {

        if (dataBaseName.equalsIgnoreCase("mysql")) {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cu",
                    "root",
                    "root"
            );

        } else if (dataBaseName.equalsIgnoreCase("oracle")) {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            conn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe",
                    "system",
                    "manager"
            );
        }

        return conn;
    }
}

class First {

    public static void main(String args[])
            throws ClassNotFoundException, SQLException {

        Connection conn = MyConnection.getConnection("MySql");

        System.out.println(conn);
    }
}