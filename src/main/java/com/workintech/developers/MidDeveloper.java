package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(long id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(getSalary() + 2000);
        System.out.println("Mid Developer is working on advanced tasks. New salary: " + getSalary());
    }
}
