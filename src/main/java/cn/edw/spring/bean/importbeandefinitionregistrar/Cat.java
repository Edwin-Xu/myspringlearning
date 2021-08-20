package cn.edw.spring.bean.importbeandefinitionregistrar;

/**
 * @author Edwin Xu
 * @date 5/20/2021 9:34 PM.
 *
 * 这个是没有使用任何类似@Component注解注入的普通POJO类
 */

public class Cat {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
