package com.java.codeAssignment.ThirdAssignment;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Running = new int[n];

        int i;
        for (i = 0; i < n; ++i) {
            Running[i] = sc.nextInt();
        }

        for (i = 1; i < n; ++i) {
            Running[i] += Running[i - 1];
        }

        for (i = 0; i < n; ++i) {
            System.out.print(Running[i] + " ");
        }

    }
}
