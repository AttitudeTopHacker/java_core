package com.java.repeat;

import com.java.Aug_24_2023.matrix;

/**
 * create by  mohd salman
 * Date : 14/02/24
 * Time : 10:24 pm
 * Project_Name : java_core
 */

public class r7 {
    public static void main(String[] args) {
        int[][] arr = matrix.NewBinaryMatrixRowCol();
        matrix.display(arr);
        int row = 0, col = arr[0].length - 1, search = 51;
        while (row < arr.length && col >= 0) {
            if (search == arr[row][col]) {
                System.out.println("find element in matrix : ");
                return;
            } else if (arr[row][col] > search) {
                col--;
            } else if (arr[row][col] < search) {
                row++;
            }
        }

        System.out.println("not find :-");

    }
}

    