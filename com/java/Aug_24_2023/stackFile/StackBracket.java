package com.java.Aug_24_2023.stackFile;

import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 25/10/23
 * Time : 6:02 pm
 * Project_Name : java_core
 */

public class StackBracket {
    public static void main(String[] args) {
        String str = /*new Scanner(System.in).nextLine()*/ "[()]{}[](){{}}";
        System.out.println(IsBalanced(str, str.length()));
        System.out.println(IsBalancedShort(str));
    }

    private static boolean IsBalancedShort(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if ('(' == ch) {
                st.push(')');
            } else if ('[' == ch) {
                st.push(']');
            } else if ('{' == ch) {
                st.push('}');
            } else if (st.isEmpty() || st.pop() != ch) {
                return false;
            }
        }
        return st.isEmpty();
    }

    private static boolean IsBalanced(String str, int n) {
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (st.empty() && (ch == ')' || ch == ']' || ch == '}')) {
                return false;
            } else {
                char topElement = st.peek();
                if ((char) (topElement + 1) == ch || (char) (topElement + 2) == ch) {//    ) -> topElement+1==41  },] -> topElement+2==93 , 125;
                    st.pop();
                } else {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

}

    