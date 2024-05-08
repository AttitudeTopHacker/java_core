package com.java.codeAssignment.secondAssignment;

import java.util.Scanner;


//
//Take the following as input.
//
//        A number (N1)
//A number (N2)
//Write a function which prints all armstrong numbers between N1 and N2 (inclusive).
//
//        371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3
//Input Format
//
//Constraints
//
//0 < N1 < 100 N1 < N2 < 10000
//Output Format
//
//Sample Input
//
//400
//        1000
//
//Sample Output
//
//407
//
//Explanation
//
//Each number in output is in separate line.



public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        ArmStrongNumberAll(n1, n2);
    }

    private static void ArmStrongNumberAll(int n1, int n2) {
        for (int i = n1; i < n2; i++) {
            printArmstrong(i);
        }

    }

    private static void printArmstrong(int n) {
        int arm = 0, copy = n;

        while (n != 0) {
            arm = arm + (int) Math.pow(n % 10, 3);
            n /= 10;
        }
        if (arm == copy)
            System.out.println(arm);

    }
}
