package cn.edw.spring.transaction.tx;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author taoxu.xu
 * @date 8/19/2021 4:08 PM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class Tx1ServiceImplTest {
    @Autowired
    private TxServiceImpl txService;

    @Test
    void publicMethod() {
        txService.publicMethod();
    }


    @Test
    void defaultMethod() {
        txService.defaultMethod();
    }
    @Test
    void protectedMethod() {
        txService.protectedMethod();
    }



}