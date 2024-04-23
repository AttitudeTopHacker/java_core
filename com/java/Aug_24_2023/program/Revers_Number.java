package com.java.Aug_24_2023.program;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 7:38 am
 * Project_Name : java_core
 */

public class Revers_Number {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int revers = 0;
        while (n > 0) {
            int digit = n % 10;
            revers = revers * 10 + (digit);
            n /= 10;
        }
        System.out.println(revers);
    }
}

    