package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 27/10/23
 * Time : 7:28 pm
 * Project_Name : java_core
 */

public class prefixToPostfix {
    public static void main(String[] args) {
        String str = "-+35/*426";
        Stack<String> stack = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                stack.push(ch + "");
            } else if (stack.size() > 1) {
                stack.push(Calculate(stack.pop(), stack.pop(), ch));
            }
        }
        System.out.println(stack.peek());
    }

    private static String Calculate(String v1, String v2, char ch) {
        return v1 + v2 + ch;
    }

}

    