package com.java.pattern;

public class ptr12 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            int sp = 0;

            while (sp < (n - 1) - i) {
                System.out.print("   ");
                sp++;
            }

            for (int j = 1; j <=i * 2 + 1; j++) {
                if (j % 2 == 0) {
                    System.out.print("!");
                }else {
                    System.out.print("  *  ");
                }
            }
            System.out.println();
        }
    }
}


//                  *
//               *  !  *
//            *  !  *  !  *
//         *  !  *  !  *  !  *
//      *  !  *  !  *  !  *  !  *





