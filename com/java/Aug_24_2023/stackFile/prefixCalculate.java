package com.java.Aug_24_2023.stackFile;


import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 27/10/23
 * Time : 11:17 am
 * Project_Name : java_core
 */

public class prefixCalculate {

    public static void main(String[] args) {
        String str = "-+35/*426";
        Stack<Double> value = new Stack<>();

        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                value.push((double) ch - 48);
            } else if (value.size() > 1) {
                double v1 = value.pop();
                double v2 = value.pop();
                value.push(Calculate(v1, v2, ch));
            }

        }
        System.out.println(value.peek());
    }


    private static Double Calculate(double v1, double v2, char ch) {

        if (ch == '-') {
            return v1 - v2;
        } else if (ch == '+') {
            return v1 + v2;
        } else if (ch == '/') {
            return v1 / v2;
        }
        return v1 * v2;
    }
}




    