package cn.edw.spring.aop.demo4;

/**
 * @author Edwin Xu
 * @date 5/21/2021 7:52 PM.
 */

public class Cat {
    private String name;

    public void eat(String foodName){
        System.out.println(name +" is eating "+foodName);
    }

    public void sleep(){
        System.out.println(name +" is sleeping");
    }



    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }
}
