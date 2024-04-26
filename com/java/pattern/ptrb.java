package com.java.pattern;

import java.util.Scanner;

public class ptrb {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n * 2 - 1; i++) {
            int sp = 0;
            int vlPrint = 0;
            int count=0;
            if (i <= n) {
                count = i;
                while (sp < n - i) {
                    System.out.print("  ");
                    sp++;
                }
                while (vlPrint < i * 2 - 1) {
                    if (vlPrint < (i * 2 - 1) / 2) {
                        System.out.print(count++ + " ");
                    } else {
                        System.out.print(count-- + " ");
                    }
                    vlPrint++;
                }
            } else {
                while (sp < (i - n)) {
                    System.out.print("  ");
                    sp++;
                }
                count = n-(i-n);
                while (vlPrint < (2 * n) - ((i * 2) - (2 * n)) - 1) {   //n = n*2-1  =n-(i-n)+1
                    if (vlPrint < ((2 * n) - ((i * 2) - (2 * n)) - 1)/2 ) {
                        System.out.print(count++ +" ");
                    }else {
                        System.out.print(count-- + " ");
                    }
                    vlPrint++;
                }
            }
            System.out.println();
        }
    }
}

//Pattern Rhombus
//    1
//  2 3 2
//3 4 5 4 3
//  2 3 2
//    1