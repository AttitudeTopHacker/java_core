package com.java.lecture;
public class jun24_5_TOH {
    public static void main(String[] args) {
        TOH(1000, 1, 3, 2);
    }
    private static void TOH(int n, int s, int h, int d) {
        if (n == 0) {
            return;
        }
        TOH(n - 1, s, d, h);
        System.out.println(n + " " + s + "source to destination " + d);
        TOH(n - 1, h, s, d);
    }
}
