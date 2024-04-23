package com.java.repeat;

public class r28 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
//                                    2147483647
    }


    public static int reverse(int x) {
        long rev = 0, rem;
        while ((x != 0)) {
            rem = x % 10;
            rev = rev * 10 + rem;
            x /= 10;
        }
        if (rev >= -2147483648 && rev <= 2147483647)
            return (int) rev;
        return 0;
    }
}