package com.java.repeat;


/**
 * create by  mohd salman
 * Date : 20/02/24
 * Time : 6:55 pm
 * Project_Name : java_core
 */

public class r20 {
    public static void main(String[] args) {
        int number = 71693;
        System.out.println(NumberToWord(number));
    }

    private static String NumberToWord(int number) {
        String[] unary = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] binary = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        if (0 < number && number < 20) {
            return unary[number];
        } else if (20 < number && number < 100) {
            return binary[number / 10] + " " + NumberToWord(number % 10);
        } else if (100<number&&number < 1000) {
            return unary[number / 100] + " hundred " + NumberToWord(number % 100);
        } else if (1000<number&&number < 10000) {
            return unary[number / 1000] + " thousand " + NumberToWord(number % 1000);
        } else if (10000<number&&number < 100000) {
            return binary[number / 10000] + " " + NumberToWord(number % 10000);
        } else if (100000<number&&number < 1000000) {
            return unary[number / 100000] + " lak " + NumberToWord(number % 100000);
        }
        return "zero";

    }

}

    