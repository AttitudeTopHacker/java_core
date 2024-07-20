package com.java.codeAssignment.secondAssignment;

import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        if (IsArmstrongOrNot(n)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    private static boolean IsArmstrongOrNot(int n) {
        int temp = n, sum = 0;
        int p = CountDigit(n);
        while (temp != 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, p);
            temp = temp / 10;
        }
        return sum == n;
    }

    private static int CountDigit(int n) {
        int i = 0;
        while (n != 0) {
            n = n / 10;
            i++;
        }
        return i;
    }
}
