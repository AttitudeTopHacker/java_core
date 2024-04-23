package com.java.Aug_24_2023.program;

public class invers {
    public static void main(String[] args) {
        int b = 163524;
        System.out.println(inversfunsolve(b));
    }

    private static int inversfunsolve(int b) {
        int inversum = 0, digit, p = 1, n = b;
        while (n > 0) {
            digit = n % 10;
            inversum = inversum + (p * (int) (Math.pow(10, digit - 1)));
            n = n / 10;
            p++;
        }

        return inversum;

    }

}
