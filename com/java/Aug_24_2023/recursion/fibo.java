package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 26/09/23
 * Time : 9:31 pm
 * Project_Name : java_core
 */

public class fibo {
    public static void main(String[] args) {
        int n = 40;
        System.out.println(fibon(n));

    }

    private static int fibon(int n) {
        if(n==1||n==0){
            return n;
        }
        return fibon(n - 1) + fibon(n - 2);
    }
}

    