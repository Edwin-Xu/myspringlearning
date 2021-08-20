package cn.edw.spring.aop.proxypattern.jdkdynamicproxy.demo02;

/**
 * @author taoxu.xu
 * @date 8/20/2021 4:19 PM
 */
public class SpeckListenServiceImpl implements SpeckingService, ListeningService{
    @Override
    public void listening() {
        System.out.println("listening");
    }

    @Override
    public void specking() {
        System.out.println("specking");
    }
}
