package topic10.Quiz3_MockExam.sqlTest;

import java.sql.*;


public class readDataBase {

    public static void connectToCongregationDB(){

        try (
                Connection congregationDB_Connection = DBConnection.congregationDB_Connection();
                Statement stmt = congregationDB_Connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet rs = stmt.executeQuery("SELECT * FROM publishers");
                )
        {
            rs.last();

            System.out.println("Connected!!");
            System.out.println(rs.getString("name") );


        }
        catch (SQLException s){
            System.out.println("Data Base not found");
          }
    }

    public static void main(String[] args) {
        connectToCongregationDB();
    }
}
