package com.java.example;

import java.util.Scanner;

public class j7 {
    private static int i, j;

    public static void Pattern1(int n) {
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void Pattern2(int n) {
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void Pattern3(int n) {
        for (i = 1; i <=5; i++) {
            for (j = 1; j<=5; j++) {
                if (j >=(6)- i) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number :-");
//        int s = sc.nextInt();
//         *  *  *  *  *
//         *  *  *  *  *
//         *  *  *  *  *
//         *  *  *  *  *
//         *  *  *  *  *
//        Pattern1(s);
//        System.out.println("\n");
//         *
//         *  *
//         *  *  *
//         *  *  *  *
//         *  *  *  *  *

//        Pattern2(s);
//        System.out.println("\n");

        Pattern3(5);

    }
}
