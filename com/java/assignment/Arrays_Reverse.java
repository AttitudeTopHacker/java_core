package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 17/09/23
 * Time : 10:53 pm
 * Project_Name : java_core
 */

public class Arrays_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        ReversArray(array);
        for (int e : array) {
            System.out.println(e);
        }
    }

    private static void ReversArray(int[] array) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            int tmp = array[l];
            array[l] = array[r];
            array[r] = tmp;
            l++;
            r--;
        }
    }
}

    