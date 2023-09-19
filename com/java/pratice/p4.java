package com.java.pratice;

//recurtion factorial ;
import java.util.Scanner;
public class p4 {
    static protected int factorial(int n) {

        if (n == 1 || n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
