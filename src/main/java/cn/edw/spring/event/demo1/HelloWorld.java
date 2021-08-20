package cn.edw.spring.event.demo1;

/**
 * @author Edwin Xu
 * @date 11/30/2020 11:57 PM.
 */


public class HelloWorld {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public HelloWorld(String msg) {
        this.msg = msg;
    }


    public void sayHi() {
        String hi = "HelloWorld{" +
                "msg='" + msg + '\'' +
                '}';
        System.out.println(hi);
    }
}
