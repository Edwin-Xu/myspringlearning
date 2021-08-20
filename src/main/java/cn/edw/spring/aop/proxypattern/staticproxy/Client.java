package cn.edw.spring.aop.proxypattern.staticproxy;

/**
 * @author Edwin Xu
 * @date 4/20/2021 10:03 PM.
 */

public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxy = new Proxy(realSubject);

        proxy.request("EDWIN XU");
    }

}
