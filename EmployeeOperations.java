package com.company;
public class EmployeeOperations {
    public static void main (String[] args) {
        Employee obj1 = new Employee(40, "siva");
        Employee obj2 = new Employee("suri");
        obj1.printEmployeeObject(obj1);
        obj2.printEmployeeObject(obj2);
    }
}
