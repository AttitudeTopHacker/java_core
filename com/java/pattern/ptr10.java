package com.java.pattern;

public class ptr10 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int sp = 0;
            while (i > sp) {
                System.out.print("  ");
                sp++;
            }
            for (int j = (n - 1 - i) * 2; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


//* * * * * * * * *
//  * * * * * * *
//    * * * * *
//      * * *
//        *