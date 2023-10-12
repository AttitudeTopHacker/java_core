package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 28/09/23
 * Time : 5:14 am
 * Project_Name : java_core
 */

public class gcdRecursion {
    public static void main(String[] args) {

        System.out.println(gcdR(16, 22));
        System.out.println(gcdR2(16, 22));
    }

    private static int gcdR2(int x, int y) {

        if (x % y == 0)
            return y;
        if (y % x == 0)
            return x;
        if (x > y) {
            return gcdR2(x % y, y);
        } else return gcdR2(x, y % x);
    }

    private static int gcdR(int x, int y) {
        if (y == 0) {
            return x;
        }

        return gcdR(y, x % y);
    }
}

    