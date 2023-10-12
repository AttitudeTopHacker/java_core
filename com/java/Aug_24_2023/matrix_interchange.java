package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 6:13 pm
 * Project_Name : java_core
 */

public class matrix_interchange {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 11},
                {5, 6, 7, 8, 22},
                {9, 10, 11, 12, 33},
                {13, 14, 15, 16, 44}};
        matrix.display(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < (arr[row].length) / 2; col++) {
                int tmp = arr[row][col];
                arr[row][col] = arr[row][(arr[row].length - 1) - col];
                arr[row][(arr[row].length - 1) - col] = tmp;
            }
        }
        matrix.display(arr);
    }
}

    