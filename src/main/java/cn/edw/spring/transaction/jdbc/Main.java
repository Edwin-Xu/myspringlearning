package cn.edw.spring.transaction.jdbc;

/**
 * @author Edwin Xu
 * @date 12/1/2020 5:04 PM.
 */


import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;

/**
* spring 事务分为两种方式：
 * 1. 编程式事务，需要手动编程，侵入式。
 *   接祖PlatformTransactionManager、TransactionTemplate等类
 * 2. 声明式事务
 *  a. 使用xml: tx + aop
 *  b. @Transaction
 *
* */
public class Main {

    public static void main(String[] args) {
//        PlatformTransactionManager

//        TransactionTemplate

    }


    @Transactional(rollbackFor = SQLException.class)
    public void dataOperation(){
        System.out.println(" userDao or other data operation using database !");
    }
}
