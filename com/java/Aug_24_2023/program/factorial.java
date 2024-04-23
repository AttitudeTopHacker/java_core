package com.java.Aug_24_2023.program;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter factorial number");
        System.out.println("Factorial :- " + Fact(sc.nextInt()));
        System.out.println("Factorial Function :-" + FactFun(sc.nextInt()));
    }

    private static long FactFun(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    private static long Fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * Fact(n - 1);
    }
}
