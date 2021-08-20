package cn.edw.spring.db.config;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.*;

/**
 * Created by Edwin Xu on 10/20/2020 2:56 PM.
 */

//@Configuration
public class DataSourceConfig {
    @Autowired
    private Environment env;

    @Bean
    public DataSource getDataSource(){
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl(env.getProperty("spring.datasource.url"));
        dataSource.setPassword("spring.datasource.password");
        dataSource.setUser("spring.datasource.username");

        return dataSource;
    }
}













