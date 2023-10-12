package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 26/09/23
 * Time : 9:58 pm
 * Project_Name : java_core
 */

public class sumOf_digitRecursion {
    public static void main(String[] args) {
        int num = 123194;
        System.out.println(sumOfDigit(num));
    }

    private static int sumOfDigit(int num) {
        int digit = num % 10;
        if (num == 0) {
            return digit;
        }
        return digit + sumOfDigit(num / 10);
    }
}

    