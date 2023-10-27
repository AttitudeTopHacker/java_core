package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

public class infixCalculate {
    public static void main(String[] args) {
        String str = "6+5-(4*2)/6";
        if (str.charAt(0) == '+') {
           str= str.substring(1);
        }
        Stack<Character> Operator = new Stack<>();
        Stack<Double> value = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch <= 57 && ch >= 48) {
                value.push((double) (ch - 48));

            } else if (Operator.isEmpty() && ch != '/' && ch != '*' && ch != ')' || Operator.peek() == '(') {
                if (ch == '-') {
                    if (value.isEmpty()) {
                        value.push(((double) str.charAt(++i) - 48) * -1);
                    }
                } else {
                    Operator.push(ch);
                }
            } else if (!Operator.isEmpty() && ch == ')') {
                while (Operator.peek() != '(') {
                    double v2 = value.pop();
                    double v1 = value.pop();
                    value.push(Calculate(v1, v2, Operator.pop()));
                }
                Operator.pop();
            } else if (ch == '+' || ch == '-') {
                double v2 = value.pop();
                double v1 = value.pop();
                value.push(Calculate(v1, v2, Operator.pop()));
                Operator.push(ch);
            } else if (!Operator.isEmpty() && ch == '/' || ch == '*') {
                if (Operator.peek() == '*' || Operator.peek() == '/') {
                    double v2 = value.pop();
                    double v1 = value.pop();
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
            double v2 = value.pop();
            double v1 = value.pop();
            value.push(Calculate(v1, v2, Operator.pop()));
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
