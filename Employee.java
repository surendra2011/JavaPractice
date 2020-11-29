package com.company;

public class Employee {
    private int age;
    private String name;

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }

    public void printEmployeeObject(Employee employee){
        employee.printEmployee();
    }

    private void printEmployee(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

