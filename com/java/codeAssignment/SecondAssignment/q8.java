package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;


//
//Take the following as input.
//        A number
//Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number.
//
//Write a function that returns its inverse, where inverse is defined as follows
//
//Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.
//
//Print the value returned.
//Input Format
//
//Integer
//        Constraints
//
//0 < N < 1000000000
//Output Format
//
//Integer
//Sample Input
//
//32145
//
//Sample Output
//
//12543
//
//Explanation
//
//Assume that for a number of n digits, the value of each digit is from 1 to n and is unique. E.g. 32145 is a valid input number. Inverse of 32145 is 12543. In 32145, “5” is at 1st place, therefore in 12543, “1” is at 5th place; in 32145, “4” is at 2nd place, therefore in 12543, “2” is at 4th place.


public class q8 {
    public static void main(String[] args) {
        int b = (new Scanner(System.in)).nextInt();
        System.out.println(inversfunsolve(b));
    }

    private static int inversfunsolve(int b) {
        int inversum = 0, digit, p = 1, n = b;
        while (n > 0) {
            digit = n % 10;
            inversum = inversum + (p * (int) (Math.pow(10, digit - 1)));
            n = n / 10;
            p++;
        }

        return inversum;

    }
}
