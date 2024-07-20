package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int n = sc.nextInt();
            sum += n;
            if (0 < n) {
                System.out.println(n);
            } else {
                break;
            }
        }
    }
}
