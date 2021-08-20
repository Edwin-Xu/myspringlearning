package cn.edw.spring.servlet.myservlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by Edwin Xu on 11/29/2020 12:44 AM
 */
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器已启动。。。");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("当前监听器已销毁");
    }
}
