package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 27/09/23
 * Time : 7:58 pm
 * Project_Name : java_core
 */

public class kMultipleRecursion {
    public static void main(String[] args) {
        int n = 5;
        int k = 3;
        printMultiple(5, 3);

    }

    private static void printMultiple(int n, int k) {
        if (k == 0) {
            return;
        }
        printMultiple(n, k - 1);
        System.out.println(n * k);
    }
}

    