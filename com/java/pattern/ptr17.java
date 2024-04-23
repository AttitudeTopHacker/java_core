package com.java.pattern;

public class ptr17 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i < n; i++) {
            int sp = 0;
            if (i <= (n / 2)) {
                for (int j = 0; j < (n / 2) - i; j++) {
                    System.out.print("*  ");
                }
                while (sp < (i * 2) + 1) {
                    System.out.print("   ");
                    sp++;
                }
                for (int j = 0; j < (n / 2) - i; j++) {
                    System.out.print("*  ");
                }
            } else {
                    for (int j = 0; j < i-(n / 2); j++) {
                        System.out.print("*  ");
                    }
                    while (sp<n-((i*2)-n+1)){
                        System.out.print("   ");
                        sp++;
                    }

                for (int j = 0; j < i-(n / 2); j++) {
                    System.out.print("*  ");
                }
            }
            System.out.println();

        }
    }
}


//        *  *  *  *     *  *  *  *
//        *  *  *           *  *  *
//        *  *                 *  *
//        *                       *
//
//        *                       *
//        *  *                 *  *
//        *  *  *           *  *  *
//        *  *  *  *     *  *  *  *