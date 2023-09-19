package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 16/09/23
 * Time : 4:36 am
 * Project_Name : java_core
 */

public class Inverse_A {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Scanner(System.in).nextInt();
        }
        inversArray(arr);

    }

    private static void inversArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            arr1[arr[i]] = i;

        }
        for (int e : arr1) {
            System.out.print(e + " ");
        }
    }
}

    