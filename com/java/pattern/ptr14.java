package com.java.pattern;

public class ptr14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int sp = 0;
            while (sp < n - i) {
                System.out.print("  ");
                sp++;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            int sp = 0;
            while (sp <= i) {
                System.out.print("  ");
                sp++;
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//
//                        *
//                      * *
//                    * * *
//                  * * * *
//                * * * * *
//                  * * * *
//                    * * *
//                      * *
//                        *