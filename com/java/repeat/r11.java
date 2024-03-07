package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 15/02/24
 * Time : 1:38 pm
 * Project_Name : java_core
 */

public class r11 {
    public static void main(String[] args) {
        int a = 4, b = 18;
        System.out.println(Gdc(a, b));
        System.out.println(Gdc1(a, b));
    }

    private static int Gdc1(int a, int b) {
//        int small = Math.min(a, b);
        while (a % b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return b;
    }

    private static int Gdc(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a % b == 0) {
            return b;
        }
        if (b % a == 0) {
            return a;
        }
        if (a > b) {
            return Gdc(a % b, b);
        } else {
            return Gdc(a, b % a);
        }
    }

}

    