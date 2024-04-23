package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 20/10/23
 * Time : 9:12 pm
 * Project_Name : java_core
 */

public class binaryToDecimal {
    public static void main(String[] args) {
        String str = "1101001101";
        int num = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            num = num + (str.charAt(i) - '0') * (int) Math.pow(2, str.length() - 1 - i);
        }
        System.out.println(num);
    }

}

    