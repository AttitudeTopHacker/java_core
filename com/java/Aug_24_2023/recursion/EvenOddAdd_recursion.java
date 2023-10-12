package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 27/09/23
 * Time : 8:42 pm
 * Project_Name : java_core
 */

public class EvenOddAdd_recursion {
    public static void main(String[] args) {
        System.out.println(EvenOdd(5));
    }

    private static int EvenOdd(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return EvenOdd(n - 1)-n;
        } else {
            return EvenOdd(n - 1)+n;
        }
    }
}

    