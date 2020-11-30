package com.example.springlearning.di.autowire2;

import java.util.*;

/**
 * @author Edwin Xu
 * @date 11/27/2020 4:34 PM.
 */

public class People {
    private String name;

    private List<Cat> catList;


    public People(String name, List<Cat> catList) {
        this.name = name;
        this.catList = catList;
    }
    public People(String name) {
        this.name = name;
    }
    public People() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }

    public void sayHello(){
        String s =  "I am "+name+", and I have "+catList.size()+" cat" + (catList.size()>1?"s":"")+", they are:";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for (Cat cat: catList){
            sb.append(cat.getName()).append(", ");
        }
        System.out.println(sb.toString());
    }

}
