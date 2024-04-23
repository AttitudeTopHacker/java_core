package com.java.pattern;

public class ptr33 {
    public static void main(String[] args) {

        int n = 7;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2 + 1) {
                for (int j = 0; j < (n / 2 - i) + 1; j++) {
                    System.out.print("   ");

                }
                int st = 0;
                while (st < i * 2 - 1) {
                    if (st == 0 || st == i * 2 - 2) {
                        System.out.print("*  ");
                    } else {
                        System.out.print("   ");
                    }
                    st++;
                }
            } else {
                for (int j = 0; j < i - (n / 2) - 1; j++) {
                    System.out.print("   ");

                }
                int st = 0;
                while (st <  n-2*(i - (n / 2) - 1)) {
                    if (st == 0 || st == n-2*(i - (n / 2) - 1)-1) {
                        System.out.print("*  ");

                    } else {
                        System.out.print("   ");
                    }
                    st++;
                }
            }
            System.out.println();

        }
    }
}