package com.java.pattern;

public class ptr26 {
    public static void main(String[] args) {
        int n = 5, scn;
        for (int i = 0; i < n; i++) {
            scn = i;
            while (scn < n - 1) {
                System.out.print("   ");
                scn++;
            }
            for (int j = 1; j <= i * 2 + 1; j++) {
                System.out.print(j+"  ");
            }
            System.out.println();

        }
    }
}


//
//                            1
//                         1  2  3
//                      1  2  3  4  5
//                   1  2  3  4  5  6  7
//                1  2  3  4  5  6  7  8  9