package com.appslab;

public class Student {
    private String name;
    private int studentNumber;
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setName("John");
        student1.setStudentNumber(12345);
        System.out.println(student1.getName()+":\t"+student1.getStudentNumber());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
}

