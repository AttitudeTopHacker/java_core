package com.java.pattern;

public class ptr22 {
    public static void main(String[] args) {
        int n = 5;
        n = n * 2 - 1;
        for (int i = n / 2; i <= n; i++) {
            int sp = 1;
            for (int j = 0; j < n; j++) {
                while (j < i - (n / 2)) {
                    System.out.print("*   ");
                    j++;
                }
                while (sp < n - ((i * 2) - n)) {
                    System.out.print("    ");
                    j++;
                    sp++;
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


//        *                               *
//        *   *                       *   *
//        *   *   *               *   *   *
//        *   *   *   *       *   *   *   *
//        *   *   *   *   *   *   *   *   *