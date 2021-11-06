package cn.edw.spring.transaction.tx2;

import cn.edw.spring.entity.PetPO;
import cn.edw.spring.entity.UserPO;

/**
 * @author taoxu.xu
 * @date 11/5/2021 5:20 PM
 */
public interface Tx2Service {
    void addUserAndPet(UserPO user, PetPO pet);

    void addUser(UserPO user);
}
