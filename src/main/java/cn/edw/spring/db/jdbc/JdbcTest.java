package cn.edw.spring.db.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.dao.support.DaoSupport;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.object.RdbmsOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.StandardServletEnvironment;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by Edwin Xu on 10/20/2020 11:17 AM.
 */

public class JdbcTest {
    public static void main(String[] args) {
//        DataSourceUtils


//        RdbmsOperation

//        DaoSupport


    }
}
