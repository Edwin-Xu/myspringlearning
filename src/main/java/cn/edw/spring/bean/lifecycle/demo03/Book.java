package cn.edw.spring.bean.lifecycle.demo03;

import org.springframework.stereotype.Component;

/**
 * @author Edwin Xu
 * @date 5/20/2021 3:55 PM.
 */

@Component
public class Book {

    @Value(value = "Edwin's Life Secret")
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
