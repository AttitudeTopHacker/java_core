package com.java.lecture;

public class jun24_2nd_brackets {
    public static void main(String[] args) {
        int n = 2;
        possiblePrantheses(0, 0, n, "");

    }

    private static void possiblePrantheses(int op, int cl, int n, String ans) {
        if (op == n && cl == n) {
            System.out.println(ans);
            return;
        }
        if (op > n) {
            return;
        }
        possiblePrantheses(op+1, cl, n, ans + "(");
        if (op > cl) {
            possiblePrantheses(op, cl+1, n, ans + ")");
        }
    }
}
