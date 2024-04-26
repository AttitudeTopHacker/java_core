package com.java.pattern;

import java.util.Scanner;

public class ptrj {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int i ;
        for (i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print("Not Prime");
                return;
            }
        }
        if (i == n / 2 + 1) {
            System.out.println("Prime");
        }
    }
}
