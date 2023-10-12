package com.java.Aug_24_2023.recursion;


/**
 * create by  mohd salman
 * Date : 26/09/23
 * Time : 7:14 pm
 * Project_Name : java_core
 */

public class factorialRecursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if (1 == n) {
            return n;
        }
        return n * fact(n - 1);

    }
}

    