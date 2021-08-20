package cn.edw.spring.bean.postprocessor;

import cn.edw.spring.domain.Student;
import cn.edw.spring.utils.Print;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Edwin Xu
 * @date 4/20/2021 5:43 PM.
 *
 *
 *
 */

public class MyBeanPostProcessorTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans/bean003.xml");
        Student stu003 = (Student) context.getBean("stu003-1");
        Print.print("stu003-1",stu003.toString());
    }
}
