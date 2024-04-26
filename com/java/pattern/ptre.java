package com.java.pattern;

import java.util.Scanner;

public class ptre {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n; i++) {
            int vlPrint = 0;
            int count = 1;
            for (int j = 0; j < n * 2 - 1; j++) {
                while (vlPrint < i) {
                    System.out.print(count++ + " ");
                    vlPrint++;
                    j++;
                }
                while (vlPrint < (n * 2 - 1) - i) {
                    System.out.print("  ");
                    vlPrint++;
                    j++;
                }

                while (j < n * 2 - 1) {
                    System.out.print(--count + " ");
                    j++;
                }

            }
            System.out.println();
        }
    }
}


//        1               1
//        1 2           2 1
//        1 2 3       3 2 1
//        1 2 3 4   4 3 2 1
//        1 2 3 4 5 5 4 3 2
