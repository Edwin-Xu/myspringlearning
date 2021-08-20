package cn.edw.spring.transaction.tx;

import cn.edw.spring.dao.UserDao;
import cn.edw.spring.entity.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.TransactionAnnotationParser;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author taoxu.xu
 * @date 8/19/2021 4:07 PM
 */
@Service
public class TxServiceImpl implements TxService {

    @Autowired
    private UserDao userDao;


    public static void staticMethod(){
        System.out.println("staticMethod");
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void publicMethod() {
        final UserPO userPO = new UserPO();
        userPO.setName("1");
        userPO.setAge(1);
        final int insert = userDao.insert(userPO);
        System.out.println("publicMethod");
        int i = 1/0;
        userDao.insert(userPO);
    }


    private  void privateMethod(){
        System.out.println("privateMethod");
    }

    void defaultMethod(){
        final UserPO userPO = new UserPO();
        userPO.setName("1");
        userPO.setAge(1);
        userDao.insert(userPO);
        System.out.println("defaultMethod");
        int i = 1/0;
        userDao.insert(userPO);
    }

    /**
     * Closing non transactional SqlSession
     * */
    protected void protectedMethod(){
        final UserPO userPO = new UserPO();
        userPO.setName("1111");
        userPO.setAge(1111);
        userDao.insert(userPO);
        System.out.println("protectedMethod");
        int i = 1/0;
        userDao.insert(userPO);
    }


}
