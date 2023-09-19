package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 12/09/23
 * Time : 10:38 pm
 * Project_Name : java_core
 */

public class wave {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[][] arr = {{1, 2, 3, 4, 5},
                       {6, 7, 8, 9, 10},
                       {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}};
        WavePrint(arr);
    }

    public static void WavePrint(int[][] arr) {
        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }

        }
    }

}

    