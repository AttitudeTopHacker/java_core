package com.java.pattern;

public class ptr34 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i < n * 2; i++) {

            int sp = 0;
            if (i <= 5) {
                while (sp < i * 2 - 1) {
                    if (sp % 2 == 0) {
                        System.out.print(i + "  ");
                    } else {
                        System.out.print("*  ");
                    }
                    sp++;

                }

            } else {
                while (sp < 2 * (n - (i - n)) - 1) {
                    if (sp % 2 == 0) {
                        System.out.print(i + "  ");
                    } else {
                        System.out.print("*  ");
                    }
                    sp++;

                }
            }
            System.out.println();
        }

    }
}


//        1
//        2  *  2
//        3  *  3  *  3
//        4  *  4  *  4  *  4
//        5  *  5  *  5  *  5  *  5
//        6  *  6  *  6  *  6
//        7  *  7  *  7
//        8  *  8
//        9