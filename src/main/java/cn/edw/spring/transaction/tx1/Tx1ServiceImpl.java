package cn.edw.spring.transaction.tx1;

import cn.edw.spring.dao.UserDao;
import cn.edw.spring.entity.UserPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author taoxu.xu
 * @date 8/17/2021 8:08 PM
 */

@Service
public class Tx1ServiceImpl implements Tx1Service {
    @Autowired
    private UserDao userDao;

    /**
     *  Transactional方法调用非Transactional方法，有事务
     *  name 和 age都不会更新成功，因为异常回滚了
     * */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void a() {
        final UserPO userPO = userDao.selectById(1);
        userPO.setName("new name 2");
        userDao.updateById(userPO);
        b();
    }

    @Override
    public void b() {
        final UserPO userPO = userDao.selectById(1);
        userPO.setAge(-2);
        userDao.updateById(userPO);
        int i = 1/0;
    }

    /**
     * 非Transactional方法调用Transactional方法，无事务
     * name 和 age都会更新成功
     * */
    @Override
    public void c() {
        final UserPO userPO = userDao.selectById(1);
        userPO.setName("new name");
        userDao.updateById(userPO);
        d();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void d() {
        final UserPO userPO = userDao.selectById(1);
        userPO.setAge(-1);
        userDao.updateById(userPO);
        int i = 1/0;
    }

}
