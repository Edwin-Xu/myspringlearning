package com.example.springlearning.bean.inherit;

/**
 * @author Edwin Xu
 * @date 11/30/2020 5:29 PM.
 */

public class Child {
    private String msg1;
    private String msg2;
    private String msg3;

    public void setMsg3(String msg3) {
        this.msg3 = msg3;
    }

    public String getMsg2() {
        return msg2;
    }

    public void setMsg2(String msg2) {
        this.msg2 = msg2;
    }

    public void setMsg1(String msg1) {
        this.msg1 = msg1;
    }

    public String getMsg1() {
        return msg1;
    }

    public String getMsg3() {
        return msg3;
    }


    @Override
    public String toString() {
        return "Child{" +
                "msg1='" + msg1 + '\'' +
                ", msg2='" + msg2 + '\'' +
                ", msg3='" + msg3 + '\'' +
                '}';
    }
}
