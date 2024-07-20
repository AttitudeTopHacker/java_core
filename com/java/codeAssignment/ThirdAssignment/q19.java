package com.java.codeAssignment.ThirdAssignment;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class q19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        long [] arr = new long [N];

        for (int  i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        long [] left = new long [N];
        long [] right = new long [N];
        left[0] = 1;
        right[N - 1] = 1;


        for (int i = 1; i < N; ++i) {
            left[i] = left[i - 1] * arr[i - 1];
            right[N - i - 1] = right[N - i] * arr[N - i];
        }

        for (int i = 0; i < N; ++i) {
            arr[i] = left[i] * right[i];
        }

        for (int i = 0; i < N; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
