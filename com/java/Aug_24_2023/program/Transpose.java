package com.java.Aug_24_2023.program;


/**
 * create by  mohd salman
 * Date : 07/10/23
 * Time : 1:08 pm
 * Project_Name : java_core
 */

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = matrix.NewBinaryMatrixRowCol();
        System.out.println("display Method :-");
        matrix.display(arr);
        System.out.println("transpose");
        for (int row = 0; row < arr.length; row++) {
            for (int col = row; col < arr[row].length; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
        matrix.display(arr);

    }
}

    