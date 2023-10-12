package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 26/09/23
 * Time : 6:55 pm
 * Project_Name : java_core
 */

public class decreeseOrder {
    public static void main(String[] args) {
        int n = 5;
        fun1(n);

    }

    private static void fun1(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun1(n - 1);
    }
}

    