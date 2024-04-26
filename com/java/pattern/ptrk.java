package com.java.pattern;

import java.security.spec.RSAOtherPrimeInfo;

public class ptrk {
    public static void main(String[] args) {
        int k = 5;
        int n = 5 * 2 + 1;
        for (int i = 1; i <= n; i++) {
            int sp = 1;
            int st = 0;
            int count;
            if (i <= n / 2 + 1) {
                count = n / 2 + 1 - i;
                while (sp < i) {
                    System.out.print("  ");
                    sp++;
                }
                int vlprint = (n + 1) - (i * 2 - 1);
                while (st < vlprint) {
                    if (st < vlprint / 2) {
                        System.out.print(count-- + " ");
                    } else {
                        System.out.print(count++ + " ");
                    }

                    st++;

                }
            } else {
//i =7 n = 11;
                count = i - (n / 2 + 1);
                while (sp <= n - i) {
                    System.out.print("  ");
                    sp++;
                }
                int vlprint = (i - (n / 2)) * 2 - 1;

                while (st < (i - (n / 2)) * 2 - 1) {
                    if (st < (vlprint/2)) {
                        System.out.print(count-- + " ");
                    } else {
                        System.out.print(count++ + " ");
                    }
                    st++;
                }

            }
            System.out.println();
        }
    }
}
