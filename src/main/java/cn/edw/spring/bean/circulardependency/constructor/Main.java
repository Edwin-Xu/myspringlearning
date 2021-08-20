package cn.edw.spring.bean.circulardependency.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 12/1/2020 10:29 PM.
 */

public class Main {
    public static void main(String[] args) {
        BeanFactory factory =
                new ClassPathXmlApplicationContext("./config/bean/circulardependency/circulardependency.xml");
    }

}
