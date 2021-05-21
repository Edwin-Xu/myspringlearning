package com.example.springlearning.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edwin Xu
 * @date 4/20/2021 2:54 PM.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private int id;
    private String name;
    private int age;



    public void init(){
        System.out.println("init");
    }
}
