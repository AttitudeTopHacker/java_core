package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 27/10/23
 * Time : 6:38 pm
 * Project_Name : java_core
 */

public class postfixCalculate {
    public static void main(String[] args) {
        String str ="35+42*6/-"/*"65+42*6/-"*/ /*"953+4*6/-"*//* "653*6/-+";*/;
        Stack<Double> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                stack.push((double) ch - 48);
            } else if (stack.size() > 1) {
                double v2 = stack.pop();
                double v1 = stack.pop();
                stack.push(Calculate(v1, v2, ch));
            }

        }
        System.out.println(stack.peek());
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

    