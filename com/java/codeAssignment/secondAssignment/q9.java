package com.java.codeAssignment.secondAssignment;


//
//Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".
//Input Format
//
//Constraints
//
//2 < N <= 1000000000
//Output Format
//
//Sample Input
//
//3
//
//Sample Output
//
//Prime
//
//        Explanation
//
//The output is case specific


import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        CheckPrime(n);
    }

    private static void CheckPrime(int n) {
        int i;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}


