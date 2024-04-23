package com.java.repeat;


import com.java.Aug_24_2023.program.matrix;

/**
 * create by  mohd salman
 * Date : 19/02/24
 * Time : 6:44 pm
 * Project_Name : java_core
 */

public class r16 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 11,15},
                {5, 6, 7, 8, 22,25},
                {9, 10, 11, 12, 33,65},
                {13, 14, 15, 16, 44,34}};
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length / 2; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[row][arr[row].length - 1 - col];
                arr[row][arr[row].length - 1 - col] = temp;
            }
        }
        matrix.display(arr);
    }

}

    