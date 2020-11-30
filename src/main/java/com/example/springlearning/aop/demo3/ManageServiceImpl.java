package com.example.springlearning.aop.demo3;

/**
 * Created by Edwin Xu on 11/28/2020 8:19 PM
 */
public class ManageServiceImpl implements ManageService{
    @Override
    public void add(Employee employee) {
        System.out.println("Add an employee: "+employee.getName());
    }

    @Override
    public void delete(int id) {
        System.out.println("delete an employee: "+id);
    }
}
