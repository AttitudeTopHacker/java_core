package com.java.pattern;

public class ptr27 {
    public static void main(String[] args) {
        int n = 5, scn;
        for (int i = 0; i < n; i++) {
            scn = i;
            while (scn < n - 1) {
                System.out.print("   ");
                scn++;
            }
            int count = 1;
            for (int j = 0; j < i * 2 + 1; j++) {
                if (j <= (i * 2 + 1) / 2) {
                    System.out.print(count++ + "  ");
                } else {
                    System.out.print(--count - 1 + "  ");
                }
            }
            System.out.println();
        }
    }
}


//                      1
//                   1  2  1
//                1  2  3  2  1
//             1  2  3  4  3  2  1
//          1  2  3  4  5  4  3  2  1