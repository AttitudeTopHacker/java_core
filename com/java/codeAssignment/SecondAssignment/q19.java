package com.java.codeAssignment.secondAssignment;

import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (0 < n) {
            if (digitSum(sc.nextInt())) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            n--;
        }
    }


    private static boolean digitSum(int n) {
        int even = 0, odd = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                even += rem;
            } else {
                odd += rem;
            }
            n /= 10;
        }
        return even % 4 == 0 || odd % 3 == 0;
    }
}