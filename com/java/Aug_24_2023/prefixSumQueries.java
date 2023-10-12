package com.java.Aug_24_2023;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 07/10/23
 * Time : 3:37 pm
 * Project_Name : java_core
 */

public class prefixSumQueries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int[] arr = NewArray.getArray();
        int[] arr = new int[]{1, 1, 1, 1, 1, 1};
        System.out.println("normal Array :- \n" + Arrays.toString(arr));
        int[] presume = GetPrefix(arr);
        System.out.println(Arrays.toString(presume));
        System.out.println("q time search l to r tell prefix sum:-");
//        System.out.println("Enter the queries number :-");
//        int q = scanner.nextInt();
//        while (q > 0) {
//            System.out.println("Enter the Range of the array sum:-");
//            int l = scanner.nextInt();
//            int r = scanner.nextInt();
//            if (l >0 && r < presume.length)
//                System.out.println(presume[r] - presume[l-1]);
//        }

        for (int j : presume) {
            if (j == (presume[presume.length - 1] - j)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }


    private static int[] GetPrefix(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        return arr;
    }
}

    