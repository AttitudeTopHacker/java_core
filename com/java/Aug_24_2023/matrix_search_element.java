package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 10/09/23
 * Time : 9:33 am
 * Project_Name : java_core
 */

public class matrix_search_element {
    public static void main(String[] args) {
        int[][] arr = matrix.NewMatrix();
        LinearSearchMatrix(arr);

    }

    private static void LinearSearchMatrix(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if (arr[row][col] == 5) {
                    System.out.println(5 + " arr[" + row + "][" + col + "] find the element:-");
                  return;
                }
            }
        }
    }
}

    