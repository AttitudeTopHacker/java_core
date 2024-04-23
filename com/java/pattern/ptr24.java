package com.java.pattern;

public class ptr24 {
    public static void main(String[] args) {
        int n = 5, scn;
        for (int i = 0; i < n; i++) {
            scn = i;
            while (scn < n - 1) {
                System.out.print("   ");
                scn++;
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(i+1 + "  ");
            }
            System.out.println();

        }
    }
}


//                  1
//               2  2  2
//            3  3  3  3  3
//         4  4  4  4  4  4  4
//      5  5  5  5  5  5  5  5  5