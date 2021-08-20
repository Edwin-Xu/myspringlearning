package cn.edw.spring.transaction.tx1;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author taoxu.xu
 * @date 8/17/2021 8:32 PM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class Tx1ServiceTest {

    @Autowired
    private Tx1Service tx1Service;

    @Test
    void testTx() {
        tx1Service.a();
    }

    @Test
    void testTx1() {
        tx1Service.c();
    }
}