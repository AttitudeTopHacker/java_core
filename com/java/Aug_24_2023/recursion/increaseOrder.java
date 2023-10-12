package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 26/09/23
 * Time : 6:40 pm
 * Project_Name : java_core
 */

public class increaseOrder {
    public static void main(String[] args) {
        int n = 5;
        fun(n);
    }

    private static void fun(int n) {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        fun(n - 1);
        System.out.println(n);

    }
}

    