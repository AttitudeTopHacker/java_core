package com.java.pattern;

public class ptr7 {
    public static void main(String[] args) {
        int n = 5;
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                if (a == 0 || b == 0 || a == n-1 || b == n-1) {
                    System.out.print("*   ");
                }
                else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }

    }
}

//output
//        *   *   *   *   *
//        *               *
//        *               *
//        *               *
//        *   *   *   *   *