package com.java.pattern;

public class ptr21 {
    public static void main(String[] args) {
        int n = 5;
        n = n * 2 - 1;
        for (int i = 1; i <= n; i++) {
            int sp = 1;
            for (int j = 0; j < n; j++) {
                while (j < (n / 2) + 2 - i) {
                    System.out.print("*   ");
                    j++;
                }
                while (sp < i * 2 - 2) {
                    System.out.print("    ");
                    sp++;
                    j++;
                }
                while (j < n) {
                    System.out.print("*   ");
                    j++;
                }
            }
            System.out.println();

        }
    }
}

//        *   *   *   *   *   *   *   *   *
//        *   *   *   *       *   *   *   *
//        *   *   *               *   *   *
//        *   *                       *   *
//        *                               *

