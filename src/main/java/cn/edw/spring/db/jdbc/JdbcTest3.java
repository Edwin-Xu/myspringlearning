package cn.edw.spring.db.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by Edwin Xu on 10/20/2020 7:41 PM.
 */

public class JdbcTest3 {
    public static void main(String[] args) {


        // ------------- 通过JdbcTemplate操作 ---------------

        //创建数据源
        MysqlDataSource dataSource = new MysqlDataSource();
        //配置数据源
        dataSource.setURL("jdbc:mysql://127.0.0.1:3306/world?serverZone=UTC&useSSL=false");
        dataSource.setUser("root");//用户名
        dataSource.setPassword("root");//密码

        //创建JdbcTemplate对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        final String sql = "select * from city";
        //通过回调执行SQL
        jdbcTemplate.query(sql, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet rs) throws SQLException {
                while (rs.next()){
                    System.out.println(rs.getString("name"));
                }
            }
        });

    }

}
