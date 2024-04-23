package com.java.pattern;

public class ptr35 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
//              sp;  space print n-1;
            int sp = 0;
            while (sp < (n) - i) {
                System.out.print("  ");
                sp++;
            }
            int count = (n + 1 - i);
            int m2 = i * 2 - 1;
            for (int j = 0; j < m2; j++) {
                if (j < m2 / 2) {
                    System.out.print(count++ + " ");
                } else if (m2/2 == j ) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(--count + " ");
                }
            }
            System.out.println();
        }
    }
}


//                            0
//                          9 0 9
//                        8 9 0 9 8
//                      7 8 9 0 9 8 7
//                    6 7 8 9 0 9 8 7 6
//                  5 6 7 8 9 0 9 8 7 6 5
//                4 5 6 7 8 9 0 9 8 7 6 5 4
//              3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
//            2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
//          1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1