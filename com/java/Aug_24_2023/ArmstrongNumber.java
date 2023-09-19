package com.java.Aug_24_2023;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 179;
        System.out.println(num);
        if (ArmstrongNumber_or_not(num) == num) System.out.println("is armstrong Number:-");
        else System.out.println("is not armstrong Number:-");
    }

    private static int ArmstrongNumber_or_not(int num) {
        int p = count_digit(num);
        int n = 0, digit;
        while (num > 0) {
            digit = num % 10;
            n = n + (int) Math.pow(digit, p);
            num = num / 10;
        }
        return n;
    }

    private static int count_digit(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
