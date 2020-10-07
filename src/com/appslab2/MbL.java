package com.appslab2;

public class MbL {
        public static void main(String[] args) {
            int[] numbers = {6, 12, 5};

            MbL1(numbers);
            for (int number : numbers) {

                System.out.println(number);
            }
        }

        public static void MbL1(int[] numbers) {

            for (int cislo = 0; cislo < numbers.length; cislo++) {
                numbers[cislo] = numbers[cislo] * numbers.length;
            }

        }
    }
