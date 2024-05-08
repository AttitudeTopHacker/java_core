package com.java.codeAssignment.secondAssignment;

import java.util.Scanner;


//
//Take the following as input.
//
//        A number (N1)
//A number (N2)
//Write a function which prints first N1 terms of the series 3n + 2 which are not multiples of N2.
//Input Format
//
//Constraints
//
//0 < N1 < 100 0 < N2 < 100
//Output Format
//
//Sample Input
//
//10
//        4
//
//Sample Output
//
//5
//        11
//        14
//        17
//        23
//        26
//        29
//        35
//        38
//        41
//
//Explanation
//
//The output will've N1 terms which are not divisible by N2.


public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int i = 1, n = 0;
        while (n < n1) {
            int series = (3 * i) + 2;
            if (series % n2 != 0) {
                System.out.println(series);
            } else {
                n--;
            }
            i++;
            n++;
        }
    }
}
