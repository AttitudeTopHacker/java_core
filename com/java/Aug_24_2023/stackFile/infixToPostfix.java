package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 27/10/23
 * Time : 7:21 pm
 * Project_Name : java_core
 */

public class infixToPostfix {
    public static void main(String[] args) {
        String str = "6+5-(4*2)/6";
        if (str.charAt(0) == '+') {
            str = str.substring(1);
        }
        Stack<Character> Operator = new Stack<>();
        Stack<String> value = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch <= 57 && ch >= 48) {
                value.push((ch + ""));

            } else if (Operator.isEmpty() && ch != '/' && ch != '*' && ch != ')' || Operator.peek() == '(') {
                if (ch == '-') {
                    if (value.isEmpty()) {
                        value.push((str.charAt(++i) + "-"));
                    }
                } else {
                    Operator.push(ch);
                }
            } else if (!Operator.isEmpty() && ch == ')') {
                while (Operator.peek() != '(') {
                    String v2 = value.pop();
                    String v1 = value.pop();
                    value.push(Calculate(v1, v2, Operator.pop()));
                }
                Operator.pop();
            } else if (ch == '+' || ch == '-') {
                String v2 = value.pop();
                String v1 = value.pop();
                value.push(Calculate(v1, v2, Operator.pop()));
                Operator.push(ch);
            } else if (!Operator.isEmpty() && ch == '/' || ch == '*') {
                if (Operator.peek() == '*' || Operator.peek() == '/') {
                    String v2 = value.pop();
                    String v1 = value.pop();
                    value.push(Calculate(v1, v2, Operator.pop()));
                    Operator.push(ch);
                } else {
                    Operator.push(ch);
                }
            } else if (ch == '(') {
                Operator.push(ch);
            } else {

                System.out.println("Invalid syntax: ");
            }

        }
        while (value.size() > 1) {
            String v2 = value.pop();
            String v1 = value.pop();
            value.push(Calculate(v1, v2, Operator.pop()));
        }
        System.out.println(value.peek());
    }

    private static String Calculate(String v1, String v2, char ch) {
        return  v1 + v2 +ch;
    }
}

    