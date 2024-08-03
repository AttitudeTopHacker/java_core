package com.java.lecture;

public class jun24_2nd_mazepath {
    public static void main(String[] args) {
        int n = 3;
        mazepath(1, 1, n, "");
    }

    private static void mazepath(int r, int c, int n, String ans) {
        if (r == n && c == n) {
            System.out.println(ans);
            return;
        }
        if (c > n || r > n) {
            return;
        }
        mazepath(r, c + 1, n, ans + "H");
        mazepath(r + 1, c, n, ans + "V");
        mazepath(r + 1, c + 1, n, ans + "D");
    }
}
