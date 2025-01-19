package com.java.jobtime;

public class q6 {
    public static void main(String[] args) {
        int n = 5, i = 0, j = 0, sp=0;
        while (i < n) {
            while (sp < n-i-1) {
                System.out.print("   ");
                sp++;
            }
            while (j<i*2+1) {
                System.out.print(" * ");
                j++;
            }
            System.out.println();
            i++;
            j=0;
            sp=0;
        }
    }
}
