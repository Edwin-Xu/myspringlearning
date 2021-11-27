package cn.edw.spring.transaction.tx2;

import cn.edw.spring.dao.PetDao;
import cn.edw.spring.dao.UserDao;
import cn.edw.spring.entity.PetPO;
import cn.edw.spring.entity.UserPO;
import cn.edw.spring.utils.FakerUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author taoxu.xu
 * @date 11/5/2021 5:31 PM
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class Tx2ServiceImplTest {
    @Autowired
    private Tx2Service service;

    @Resource
    private PetDao petDao;

    @Resource
    private UserDao userDao;
    @Test
    public void test01(){
        service.addUserAndPet(new UserPO(0, FakerUtil.fakeName(), 2),  new PetPO(0, FakerUtil.fakeName()));
    }

    @Test
    public void test03(){
        userDao.insert(new UserPO(0, FakerUtil.fakeName(), 2));
        int i = 1/0;
        petDao.insert(new PetPO(0, FakerUtil.fakeName()));
    }

    @Test
    public void test02(){
        service.addUser(new UserPO(0, FakerUtil.fakeName(), 2));
    }

    @Test
    public void test04(){
        PetPO petPO = petDao.selectById(5);
        System.out.println(petPO);
        System.out.println(petPO.getName()==null);
        System.out.println(petPO.getName().equals(""));
    }

}