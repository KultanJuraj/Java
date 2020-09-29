package com.appslab;

public class Equality_of_3_values {
    public static void main(String[] args){
    byte number1 = 1;
    byte number2 = 1;
    byte number3 = 1;
    byte equality = 1;
        if (number1==number2){
        equality++;
    }
        if (number1== number3){
            equality++;
        }
        if (number2==number3){
            equality++;
        }
        if (equality == 1){
            System.out.println("Number of equals is:\t"+0 );
        }
        if (equality>=2 && equality<=3){System.out.println("Number of equals is:\t" + equality);}
        if (equality==4){
            --equality;
            System.out.println("Number of equals is:\t" + equality);
        }

    }
}
