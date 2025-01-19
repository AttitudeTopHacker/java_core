package com.java.jobtime;

public class q1 {
    public static void main(String[] args) {
        int n = 5;
        int i = 0;
        int j=0;
        while (i < n) {
            while (j < n - i) {
                System.out.print("* ");
                j++;
            }j=0;
            System.out.println();
            i++;
        }
    }
}
