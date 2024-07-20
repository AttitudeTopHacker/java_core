package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;


//
//Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.
//Input Format
//
//Constraints
//
//0 < N <= 1000000000
//Output Format
//
//Sample Input
//
//101010
//
//Sample Output
//
//42
//
//Explanation
//
//For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.



public class q4 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        System.out.println(convertBinary(n));
    }

    private static int convertBinary(int n) {
        int decimal = 0;
        int p = 0;
        while (n!= 0)
        {
            decimal = decimal + ((n % 10) * (int) Math.pow(2, p));
            p++;
            n = n/10;
        }
        return decimal;

    }
}
