package cn.edw.spring.db.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * Created by Edwin Xu on 10/20/2020 5:29 PM.
 */

public class JdbcTest2 {
    public static void main(String[] args) throws Exception{

        // -----------------纯JDBC-----------------------

        //加载驱动，有必要吗？ 不写也是可以的。
//        Class.forName("com.mysql.cj.jdbc.MysqlDataSource");
        //mysql8.0+ --> com.mysql.cj.jdbc.Driver

        //创建一种数据源:mysql数据源
        MysqlDataSource dataSource = new MysqlDataSource();

        //配置方式1：通过setter配置
//        dataSource.setDatabaseName("world");//数据库名称
//        dataSource.setPort(3306);//端口
//        dataSource.setUser("root");//用户名
//        dataSource.setPassword("root");//密码
//        dataSource.setServerName("localhost");//mysql服务器名，即相应的IP地址
//        dataSource.setServerTimezone("UTC");//设置时区，UTC是协调世界时

        //配置方式2：通过URL配置
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/world?characterEncoding=UTF-8&useSSL=false&serverTimezone=UTC");
        dataSource.setUser("root");//用户名
        dataSource.setPassword("root");//密码

        //获取一个连接
        Connection connection = dataSource.getConnection("root","root");
        //获取一个数据库操作对象：Statement
        Statement statement= connection.createStatement();
        //执行SQL
        ResultSet resultSet = statement.executeQuery("select * from city");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }




//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

//        final  String sql = "select * from city";
//        jdbcTemplate.execute(sql);

    }
}
