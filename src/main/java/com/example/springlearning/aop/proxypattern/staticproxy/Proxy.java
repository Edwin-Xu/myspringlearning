package com.example.springlearning.aop.proxypattern.staticproxy;

import com.example.springlearning.utils.Print;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edwin Xu
 * @date 4/20/2021 10:01 PM.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Proxy implements Subject {
    private Subject realSubject;

    @Override
    public void request(String from) {
        Print.print("Proxy", from);
        realSubject.request(from);
    }
}
