package com.appslab;

public class Pie {
    public static void main(String []args){
        byte NumbOfS = 15;
        byte NumberOfR = 6;
        byte SliceEach =3;
        byte x = (byte) (NumberOfR*SliceEach);
        if (x<=NumbOfS){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.println(NumbOfS+"\t"+NumberOfR+"\t"+SliceEach );
    }
}
