package com.java.pattern;

public class ptr29 {
    public static void main(String[] args) {
        int n = 5, scn;
        for (int i = 0; i < n; i++) {
            scn = i;
            while (scn < n - 1) {
                System.out.print("   ");
                scn++;
            }

            for (int j = 0; j < i * 2 + 1; j++) {
                if (j == 0 || j == (i * 2 )) {
                    System.out.print(i + 1 + "  ");
                } else {
                    System.out.print(0 + "  ");
                }
            }
            System.out.println();
        }
    }
}


//
//                       1
//                    2  0  2
//                 3  0  0  0  3
//              4  0  0  0  0  0  4
//           5  0  0  0  0  0  0  0  5