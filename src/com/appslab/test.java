package com.appslab;
import java.util.Scanner;
public class test {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj cislo od 1 po 32:\t");
        byte number = input.nextByte();
        System.out.println("Pocet tvojich sietovych bitov je:\t"+number);
    }
}
