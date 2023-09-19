package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 17/09/23
 * Time : 9:36 pm
 * Project_Name : java_core
 */

public class Arrays_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
//        5
//        1
//        3
//        4
//        2
//        5
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        System.out.println(FindNumberLeanerSearch(M, a));


    }

    private static int FindNumberLeanerSearch(int n, int[] a) {
        for (int i =0;i<a.length;i++){
            if (a[i] == n) {
                return i;
            }
        }
        return -1;
    }
}

    