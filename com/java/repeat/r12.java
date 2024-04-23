package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 18/02/24
 * Time : 11:42 pm
 * Project_Name : java_core
 */

public class r12 {
    public static void main(String[] args) {
        int num = 42135, sum = 0;
        int v = 1;
        while (num != 0) {
            int rem = num % 10;
            sum = sum + v * (int) Math.pow(10, rem - 1);
            num /= 10;
            v++;
        }
        System.out.println(sum);
    }

}

    