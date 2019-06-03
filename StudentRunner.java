package com.trimindtech.training.day04;

public class StudentRunner {

    public static void main(String[] args) {
        Student student1 = new Student("anu",20);
        student1.setName("anu");
        student1.setAge(20);

        Student student2 = new Student("sonu",18);
        student2.setName("sonu");
        student2.setAge(18);

        Student student3 = new Student("monu",19);
        student3.setName("monu");
        student3.setAge(19);

        System.out.println(Student.noOfObjects);

    }
}
