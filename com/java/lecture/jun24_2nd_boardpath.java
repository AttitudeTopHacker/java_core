package com.java.lecture;

public class jun24_2nd_boardpath {
    public static void main(String[] args) {
        int n = 4;
//        String s="dflkd";
//        System.out.println(s.substring(2,s.length()));
        posibleBoardPath(n, 0, "");

    }
    private static void posibleBoardPath(int n, int val, String ans) {
        if (n == val) {
            System.out.println(ans);
            return;
        }
        if (val > n) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            posibleBoardPath(n, val + i, ans + i);
        }
    }
}
