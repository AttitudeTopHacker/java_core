package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 27/09/23
 * Time : 8:37 pm
 * Project_Name : java_core
 */

public class N_numberOfSum {
    public static void main(String[] args) {
        System.out.println(sum(4));
    }

    private static int  sum(int n) {
        if (n == 0)
            return 0;
        return n + sum(n - 1);

    }

}

    