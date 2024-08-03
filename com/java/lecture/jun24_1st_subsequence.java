package com.java.lecture;

public class jun24_1st_subsequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subsequenc(str, ""));
    }

    private static int subsequenc(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return 1;
        }
        int m= subsequenc(str.substring(1), ans);

        int n  = subsequenc(str.substring(1), ans + str.charAt(0));
        return m+n;
    }
}
