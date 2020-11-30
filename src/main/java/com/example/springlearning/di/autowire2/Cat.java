package com.example.springlearning.di.autowire2;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/27/2020 4:27 PM.
 */

public class Cat {
    private String name ;

    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
        name="edwinxu's cat";
    }

    public String getName() {
        return name;
    }
}
