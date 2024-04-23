package com.java.pattern;

public class ptr16 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < (n * 2) - 1; i++) {
            int sp = 0;
            if (i < n) {
                while (sp < n - i - 1) {
                    System.out.print("    ");
                    sp++;

                }

                for (int j = 0; j < n - i; j++) {
                    System.out.print("*   ");
                }
            } else {
                while (sp < i - (n - 1)) {
                    System.out.print("    ");
                    sp++;
                }
                for (int j = 0; j < i - ((n - 1)-1); j++) {
                    System.out.print("*   ");
                }

            }
            System.out.println();
        }

    }
}



//                        *   *   *   *   *   *
//                    *   *   *   *   *
//                *   *   *   *
//            *   *   *
//        *   *
//    *
//        *   *
//            *   *   *
//                *   *   *   *
//                    *   *   *   *   *
//                        *   *   *   *   *   *
