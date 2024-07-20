package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        if (FactorSum(n) == digitSum(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    private static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    private static int FactorSum(int n) {
        int sum = 0;
        int i = 2;
        int sum1 = 0;
        while ((i <= n) && (n >= 1)) {
            if (n % i == 0) {
                if (i > 9) {
                    sum1 = digitSum(i);
                    sum += sum1;
                } else {
                    sum += i;
                }
                n = n / i;
            } else {
                i++;
            }
        }
        return sum;
    }
}
