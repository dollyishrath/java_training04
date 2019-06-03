package com.trimindtech.training.day04;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Employee("employee",25,2,25000);
        employee.setName("employee");
        employee.setAge(25);
        employee.setSalary(25000);
        employee.setExperience(2);
        System.out.println(employee.getName());
        System.out.println(employee.getAge());
        System.out.println(employee.getSalary());
        System.out.println(employee.getExperience());

    }
}

