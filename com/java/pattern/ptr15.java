package com.java.pattern;

public class ptr15 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < (n * 2) - 1; i++) {
            int sp = 0;
            if (i < n) {
                while (sp < i) {
                    System.out.print("    ");
                    System.out.print("    ");
                    sp++;
                }
                for (int j = 0; j < n - i; j++) {
                    System.out.print("*   ");
                }
            } else {/*         (10-1)-(5+1) = 3 ,  0 se 3 (0 1 2)
                 */

                while (sp < (n * 2) - 1 - (i + 1)) {
                    System.out.print("    ");
                    System.out.print("    ");
                    sp++;
                }                 /*i = 5-(5-1) =1 , 0 1  */
                for (int j = 0; j <=i -(n-1); j++) {
                    System.out.print("*   ");
                }
            }
            System.out.println();
        }
    }
}



//*   *   *   *   *
//        *   *   *   *
//                *   *   *
//                        *   *
//                                *
//                        *   *
//                *   *   *
//        *   *   *   *
//*   *   *   *   *