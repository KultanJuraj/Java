package com.appslab;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj slovo:");
        String slovo = input.next();
        System.out.println(Palindrome(slovo));
    }
    public static boolean Palindrome(String slovo){
        String reverse = new StringBuffer(slovo).reverse().toString();
        if (slovo.equals(reverse)){
            return true;
        }
        else {
            return false;

        }
    }
}
