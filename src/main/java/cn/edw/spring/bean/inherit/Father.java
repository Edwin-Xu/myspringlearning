package cn.edw.spring.bean.inherit;

/**
 * @author Edwin Xu
 * @date 11/30/2020 5:28 PM.
 */

public class Father {
    private String msg1;
    private String msg2;



    public String getMsg1() {
        return msg1;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    @Override
    public String toString() {
        return "Father{" +
                "msg1='" + msg1 + '\'' +
                ", msg2='" + msg2 + '\'' +
                '}';
    }

}
