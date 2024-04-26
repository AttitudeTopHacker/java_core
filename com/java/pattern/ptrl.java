package com.java.pattern;

import java.util.Scanner;

public class ptrl {
    public static void main(String[] args) {
        int p = (new Scanner(System.in)).nextInt();
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i*p);
        }
    }
}
