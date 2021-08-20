package cn.edw.spring.transaction.jdbc;

import java.sql.*;

/**
 * @author Edwin Xu
 * @date 12/1/2020 3:42 PM.
 */

public class JDBCTest {
    public static void main(String[] args) {

        String url = "mysql:localhost:3306/utool";
        String pw = "root";
        String username = "root";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,username,pw);
            connection.setTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);



            String sql = "select count(*) from type";
            PreparedStatement statement = connection.prepareStatement(sql);
           ResultSet set = statement.executeQuery(sql);
           while (set.next()){
               System.out.println(set.getString(0));
           };

        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }


    }
}
