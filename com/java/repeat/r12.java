package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 18/02/24
 * Time : 11:42 pm
 * Project_Name : java_core
 */

public class r12 {
    public static void main(String[] args) {
        int num = 213465;
        int p = 1, sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum = sum + p * (int) Math.pow(10, digit - 1);
            num = num / 10;
            p++;
        }
        System.out.println(sum);
    }

}

    