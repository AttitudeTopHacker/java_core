package com.java.codeAssignment.secondAssignment;


//
//Take the following as input.
//
//A number (N1)
//A number (N2)
//Write a function which returns the LCM of N1 and N2. Print the value returned.
//Input Format
//
//Constraints
//
//0 < N1 < 1000000000
//0 < N2 < 1000000000
//Output Format
//
//Sample Input
//
//4
//6
//
//Sample Output
//
//12
//
//Explanation
//
//The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(FunctionLCM(n1, n2));
    }

    private static int FunctionLCM(int n1, int n2) {
        int p = 2;
        int lcm = 1;
        while (p <= n1) {
            if (n1 % p == 0 && n2 % p == 0) {
                n1 = n1 / p;
                n2 = n2 / p;
                lcm *= p;
            } else {
                p++;
            }
        }
        return lcm*n1*n2;
    }
}
