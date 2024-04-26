package com.java.pattern;

import java.util.Scanner;

public class ptrc {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n; i++) {
            int stp = 1;
            while (stp <= i) {
                if (i <= 2 || stp == 1 || stp == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(0 + " ");
                }
                stp++;
            }
            System.out.println();
        }
    }
}
