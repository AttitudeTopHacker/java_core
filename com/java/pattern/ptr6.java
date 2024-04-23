package com.java.pattern;

public class ptr6 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < i) {                       /*jab tak j <i  0<0 0<1 * 1<1 tab tak space print kro*/
                    System.out.print("   ");
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();

        }
    }
}

//output
//  *  *  *  *  *
//        *  *  *  *
//              *  *  *
//                    *  *
//                          *
