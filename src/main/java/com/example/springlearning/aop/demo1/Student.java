package com.example.springlearning.aop.demo1;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/27/2020 9:41 PM.
 */

public class Student {
    private int id;
    private String name;


    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public Student() {

    }



    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
