package cn.edw.spring.transaction.tx2;

import cn.edw.spring.entity.PetPO;
import cn.edw.spring.entity.UserPO;
import cn.edw.spring.utils.FakerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author taoxu.xu
 * @date 11/7/2021 2:23 PM
 */
@RestController
@RequestMapping("/")
public class Tx2Controller {
    @Autowired
    private Tx2Service service;

    @GetMapping("/")
    public String test(){
        service.addUserAndPet(new UserPO(0, FakerUtil.fakeName(), 2),  new PetPO(0, FakerUtil.fakeName()));
        return "OK";
    }
}
