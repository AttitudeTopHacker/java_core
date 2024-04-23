package com.java.pattern;

public class ptr9 {

    public static void main(String[] args) {
        int n = 5, scn;
        for (int i = 0; i < n; i++) {
            scn = i;
            while (scn < n - 1) {
                System.out.print("   ");
                scn++;
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

}


//            *
//         *  *  *
//      *  *  *  *  *
//   *  *  *  *  *  *  *
//*  *  *  *  *  *  *  *  *