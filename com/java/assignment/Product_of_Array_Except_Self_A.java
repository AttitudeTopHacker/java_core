package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 18/09/23
 * Time : 6:49 am
 * Project_Name : java_core
 */

public class Product_of_Array_Except_Self_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
       ProductOfSum(array);
        for (int e : array) {
            System.out.print(e+" ");

        }
    }

    private static  void ProductOfSum(int[] array) {
        int n = array.length;
        if (n > 1) {
            int[] left = new int[n];
            int[] right = new int[n];
//            [1 2 3 4]
            left[0] = 1;
            right[n - 1] = 1;

            for (int i = 1; i < array.length; i++) {
                left[i] = left[i - 1] * array[i - 1];
            }
//                 0  1  2  3
//            left[1, 1, 2, 6]
//            left [] =  left[1,]* arr[1,2,3,4];
            for (int i = n - 2; i >= 0; i--) {
                right[i] = right[i + 1] * array[i + 1];
            }
//                                            0 1 2 3
//           right [] = right[     <- 1]* arr[1,2,3,4];
//                    0      1      2      3
//            right[24  <-  12   <-  4   <- 1]

            for (int i = 0; i < n; i++) {
                array[i] = left[i] * right[i];
            }

        }

    }
}

    