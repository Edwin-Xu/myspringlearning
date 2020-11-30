package com.example.springlearning.aop.demo1;

/**
 * @author Edwin Xu
 * @date 11/27/2020 9:42 PM.
 */

public class StudentServiceImpl implements StudentService{
    public StudentServiceImpl() {

    }

    @Override
    public void addStudent(Student student) {
        System.out.println("Adding student...");
    }

    @Override
    public void deleteStudent(int id) {

    }
}
