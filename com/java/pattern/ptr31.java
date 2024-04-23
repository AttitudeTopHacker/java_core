package com.java.pattern;

public class ptr31 {
    public static void main(String[] args) {
        int n = 5, scn;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i-1 == j ) {
                    System.out.print("*   ");
                } else {
                    System.out.print(n - j + "   ");
                }
            }
            System.out.println();
        }
    }
}

//        5   4   3   2   *
//        5   4   3   *   1
//        5   4   *   2   1
//        5   *   3   2   1
//        *   4   3   2   1