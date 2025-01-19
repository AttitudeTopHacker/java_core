package com.java.jobtime;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), i = 0, j = 0;
        int sp = 0;
        while (i < n) {

            while (sp < i * 2) {
                System.out.print("  ");
                sp++;
            }

            while (j < n - i) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            j = 0;
            i++;
            sp = 0;
        }

    }
}
