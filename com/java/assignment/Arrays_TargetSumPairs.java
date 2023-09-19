package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 17/09/23
 * Time : 10:24 pm
 * Project_Name : java_core
 */

public class Arrays_TargetSumPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        Arrays.sort(array);
        for (int l = 0, r = array.length - 1; l < r; ) {
            if (array[l] + array[r] == target) {
                System.out.println(array[l] + " and " + array[r]);
                l++;
                r--;
            } else if (array[l] + array[r] < target) {
                l++;

            } else {
                r--;
            }

        }

    }
}

    