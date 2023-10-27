package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 27/10/23
 * Time : 11:17 pm
 * Project_Name : java_core
 */

public class PostfixToPrefix {
    public static void main(String[] args) {
        String str = "35+42*6/-"/*postfix */;/*"-+35/*426"; prefix*/
        Stack<String> stack = new Stack<>();
        for (int i = 0; i <str.length(); i++) {
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
        return ch  + v2+v1 ;
    }
}

