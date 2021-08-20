package cn.edw.spring.bean.lifecycle.demo01;

/**
 * Created by Edwin Xu on 11/28/2020 8:18 PM
 * @author EdwinXu
 */
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        System.out.println("constructor");
        this.id = id;
        this.name = name;
    }
    public Employee() {

    }

    public void initMethod(){
        System.out.println("inti-method");
    }
    public void destroyMethod(){
        System.out.println("destroy-method");
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("employee id setter");
        this.id = id;
    }

    public void setName(String name) {
        System.out.println("employee name setter");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void sayHi(){
        System.out.println(toString());
    }
}
