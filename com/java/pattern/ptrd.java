package com.java.pattern;

import java.util.Scanner;

public class ptrd {
    public static void main(String[] args) {
        int n = 4;
//        int n = (new Scanner(System.in)).nextInt();
        int count = 0, count1 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count +" ");
                int temp = count;
                count = count + count1;
                count1 = temp;
            }
            System.out.println();
        }
    }
}
