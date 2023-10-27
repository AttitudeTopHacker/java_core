package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 27/10/23
 * Time : 11:26 pm
 * Project_Name : java_core
 */

public class prefixToInfix {
    public static void main(String[] args) {
        String str = "-+65/*426";
        Stack<String> st = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (ch <= 57 && ch >= 48) {
                st.push(ch + "");
            } else if (st.size() > 1) {
                st.push(Calculate(st.pop(), st.pop(), ch));
            }
        }
        System.out.println(st.peek());
    }

    private static String Calculate(String v1, String v2, char ch) {
        return "(" + v1 + ch + v2 + ")";
    }

}

    