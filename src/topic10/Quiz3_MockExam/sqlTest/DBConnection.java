package topic10.Quiz3_MockExam.sqlTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static final String  userUSERNAME = "tom";
    private static final String  PASSWORD = "$Q@ygXZM*8qp@Z9";

    private static final String congregationDB_URL = "jdbc:mysql://127.0.0.1/congregation";

    public static Connection congregationDB_Connection() throws SQLException {
        return DriverManager.getConnection(congregationDB_URL, userUSERNAME, PASSWORD);
    }

    public static String getUserUSERNAME() {
        return userUSERNAME;
    }

    public static String getPASSWORD() {
        return PASSWORD;
    }

    public static String getCongregationDB_URL() {
        return congregationDB_URL;
    }
}
