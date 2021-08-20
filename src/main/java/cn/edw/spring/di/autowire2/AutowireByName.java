package cn.edw.spring.di.autowire2;

/**
 * @author Edwin Xu
 * @date 11/27/2020 5:25 PM.
 */

public class AutowireByName {
    private String name;
    private Cat cat;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "AutowireByName{" +
                "name='" + name + '\'' +
                ", cat=" + cat.getName() +
                '}';
    }
}
