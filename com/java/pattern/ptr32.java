package com.java.pattern;

public class ptr32 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i <= n / 2) {
                    while (j <= (n / 2) - i) {
                        System.out.print("*  ");
                        j++;
                    }
                    int sp = 0;
                    while (sp < (i * 2) - 1) {
                        System.out.print("   ");
                        sp++;
                        j++;
                    }

                } else {

                    while (j < i - ((n / 2) - 1)) {
                        System.out.print("*  ");
                        j++;
                    }
                    int sp = 0;
                    while (sp < n - 2*(i - (n / 2 - 1))) {
                        System.out.print("   ");
                        sp++;
                        j++;
                    }
                }
                while (j < n) {
                    System.out.print("*  ");
                    j++;
                }
                System.out.println();
            }
        }


    }
}