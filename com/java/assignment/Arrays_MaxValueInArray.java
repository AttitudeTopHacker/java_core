package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 17/09/23
 * Time : 10:41 pm
 * Project_Name : java_core
 */

public class Arrays_MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(MaximumValue(a));
    }

    private static int MaximumValue(int[] a) {
        int ans = a[0];
        for (int i = 1; i < a.length; i++) {
            ans = Math.max(ans, a[i]);
        }

        return ans;
    }
}

    