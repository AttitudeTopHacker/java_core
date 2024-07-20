package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;

//
//Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.
//Input Format
//
//Constraints
//
//0 <= N <= 1000
//Output Format
//
//Sample Input
//
//10
//
//Sample Output
//
//55
//
//Explanation
//
//The 0th fibonnaci is 0 and 1st fibonnaci is 1.




public class q6 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        System.out.println(FibonacciReturn(n));
    }

    private static int FibonacciReturn(int n) {
        int count = 0, count1 = 1;
        for (int i = 1; i <= n; i++) {
            int temp = count;
            count = count + count1;
            count1 = temp;
        }
        return count;
    }
}
