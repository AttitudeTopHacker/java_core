package com.java.Aug_24_2023;

import java.util.Scanner;

public class Greatest_Common_divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two number :- ");
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

//        System.out.println(GCDChecker(a, b));
//        System.out.println(GCDChecker1(a, b));
        System.out.println(GCDChecker2(a, b));

    }

    private static int GCDChecker2(int x, int y) {
        int min;
        if (x > y)
            min = y;
        else
            min = x;
        for (int i = min; i > 0; i--) {
            if (x % i == 0 && y % i == 0) {
                min = i;
                break;
            }
        }
        return min;
    }

    private static int GCDChecker1(int x, int y) {
        while (x % y != 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }

        return y;
    }

    private static int GCDChecker(int x, int y) {
        if (x == y) return x;
        if (x % y == 0) return y;
        if (y % x == 0) return x;
        if (x > y) return GCDChecker(x % y, y);
        else return GCDChecker(x, y % x);
    }
}