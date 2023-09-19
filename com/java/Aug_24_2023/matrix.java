package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 10/09/23
 * Time : 9:34 am
 * Project_Name : java_core
 */

public class matrix {
    public static int[][] NewBinaryMatrix() {
        return new int[][]{{1, 3, 5}, {6, 7, 9}, {34, 36, 93}, {98, 99, 100}};
    }

    public static int[][] NewBinaryMatrixRowCol() {
        return new int[][]{{3, 30, 38}, {36, 43, 60}, {40, 51, 69}};
    }

    public static int[][] NewMatrix() {
        return new int[][]{{3, 5, 2}, {5, 3, 2}, {2, 6, 3}};
    }

    public static void display(int[][] arr) {
        for (int[] ints : arr) {
            for (int col = 0; col < arr[0].length; col++) {
                System.out.print(ints[col] + "  ");
            }
            System.out.println();
        }
    }

}

    