package com.java.jobtime;

public class q2 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0, j = 0;
        while (i < n) {
            while (j < n) {
                if (j < n - i-1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }
    }
}
