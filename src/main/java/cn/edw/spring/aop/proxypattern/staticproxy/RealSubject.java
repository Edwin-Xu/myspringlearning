package cn.edw.spring.aop.proxypattern.staticproxy;

import cn.edw.spring.utils.Print;

/**
 * @author Edwin Xu
 * @date 4/20/2021 10:01 PM.
 */

public class RealSubject implements Subject {
    @Override
    public void request(String from) {
        Print.print("RealSubject", from);
    }
}
