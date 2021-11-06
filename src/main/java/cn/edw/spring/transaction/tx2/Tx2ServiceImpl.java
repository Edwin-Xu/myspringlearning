package cn.edw.spring.transaction.tx2;

import cn.edw.spring.dao.PetDao;
import cn.edw.spring.dao.UserDao;
import cn.edw.spring.entity.PetPO;
import cn.edw.spring.entity.UserPO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author taoxu.xu
 * @date 11/5/2021 5:21 PM
 */
@Service
public class Tx2ServiceImpl implements Tx2Service {
    @Resource
    private PetDao petDao;

    @Resource
    private UserDao userDao;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUserAndPet(UserPO user, PetPO pet) {
        userDao.insert(user);
        int i = 1/0;
        petDao.insert(pet);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser(UserPO user) {
        add(user);
    }

    private void add(UserPO user){
        userDao.insert(user);
        int n = 1/0;
    }
}
