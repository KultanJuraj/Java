package com.appslab2;

public class MbL {
        public static void main(String[] args) {
            int[] numbers = {6, 12, 5};

            numbers = MbL(numbers);
            for (int number : numbers) {

                System.out.println(number);
            }
        }

        public static int[] MbL(int[] numbers) {

            for (int cislo = 0; cislo < numbers.length; cislo++) {
                numbers[cislo] = numbers[cislo] * numbers.length;
            }
            return numbers;

        }
    }
