package cn.edw.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * SpringBoot不使用@EnableTransactionManagement开启事务，它引入autoconfigure是会自动开启的
 * @author taoxu.xu
 */


@SpringBootApplication
public class SpringlearningApplication {

    public static void main(String[] args) {
        // 产生jdk 代理文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        // 输出cglib动态代理产生的类
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,
                "D:\\EdwinXu\\ProgrammingWorkspace\\myspringlearning\\cglib");

        SpringApplication.run(SpringlearningApplication.class, args);

    }

}
