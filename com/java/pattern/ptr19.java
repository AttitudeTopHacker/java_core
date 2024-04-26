package com.java.pattern;

import java.util.Scanner;

public class ptr19 {
    public static void main(String[] args) {
        int n = 9;

        for (int i = 1; i <= n; i++) {
            int sp = 1;
            if (i < (n / 2) + 2) {
                for (int j = 0; j < n; j++) {
                    while (j < (n / 2) + 2 - i) {
                        System.out.print("*");
                        j++;
                    }
                    while (sp < (i * 2 - 2)) {
                        System.out.print(" ");
                        sp++;
                        j++;
                    }
                    while (j < n) {
                        System.out.print("*");
                        j++;
                    }
                }
            } else {
                for (int j = 0; j < n; j++) {
                    while (j < i - (n / 2)) {
                        System.out.print("*");
                        j++;
                    }
                    while (sp < (n - ((i * 2) - n))) {
                        System.out.print(" ");
                        j++;
                        sp++;
                    }
                    while (j < n) {
                        System.out.print("*");
                        j++;
                    }

                }
            }
            System.out.println();
        }
    }
}