package cn.edw.spring.transaction.tx2;

import cn.edw.spring.entity.PetPO;
import cn.edw.spring.entity.UserPO;
import cn.edw.spring.utils.FakerUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author taoxu.xu
 * @date 11/5/2021 5:31 PM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class Tx2ServiceImplTest {
    @Autowired
    private Tx2Service service;

    @Test
    public void test01(){
        service.addUserAndPet(new UserPO(0, FakerUtil.fakeName(), 2),  new PetPO(0, FakerUtil.fakeName()));
    }

    @Test
    public void test02(){
        service.addUser(new UserPO(0, FakerUtil.fakeName(), 2));
    }


}