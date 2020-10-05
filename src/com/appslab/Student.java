package com.appslab;

public class Student {
    private String address;
    private int studentNumber;
    private String pNumber;
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setStudentNumber(6);
        student1.setpNumber("0918355642");
        student1.setAddress("Zlámaná, 02351 Ráková");
        student2.setStudentNumber(14);
        student2.setpNumber("0916233455");
        student2.setAddress("Solinky, 01001 Žilina");
        System.out.println(student1.getStudentNumber() + ", " + student1.getpNumber() + ", " + student1.getAddress());
        System.out.println(student2.getStudentNumber() + ", " + student2.getpNumber() + ", " + student2.getAddress());
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public String getpNumber(){
        return pNumber;
    }
    public String setpNumber(String pNumber){
        return pNumber=pNumber;
    }
}

