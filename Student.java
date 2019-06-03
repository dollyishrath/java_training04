package com.trimindtech.training.day04;

public class Student {
    public static int noOfObjects;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        noOfObjects++;
    }

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
