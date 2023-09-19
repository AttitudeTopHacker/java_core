package com.java.Aug_24_2023;

/**
 * palindrome
 */
public class palindrome {

    public static void main(String[] args) {

        int array = 1221;
        System.out.println(array);
        if (ReverseNumber(array) == array) {
            System.out.println("is the palindrome number:-");
        } else {
            System.out.println("is not palindrome number:-");
        }

    }

    private static int ReverseNumber(int array) {
        int digit, number = 0;
        while (0 < array) {
            digit = array % 10;
            number = number * 10 + digit;
            array = array / 10;
        }
        return number;
    }
}