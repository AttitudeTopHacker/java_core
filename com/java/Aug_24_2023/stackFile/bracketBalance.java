package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 22/10/23
 * Time : 9:38 am
 * Project_Name : java_core
 */

public class bracketBalance {
    public static void main(String[] args) {
        String str = "(()))())";
        System.out.println(IsBalancedOrNot(str));
    }

    private static boolean IsBalancedOrNot(String str) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                characters.push(ch);
            } else {
                if (ch == ')' && !characters.isEmpty()) {
                    characters.pop();
                } else {
                    return false;
                }

            }

        }
        return true;

    }

}

