package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 15/09/23
 * Time : 11:12 am
 * Project_Name : java_core
 */

public class spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        int top = 0, left = 0, right = (arr[0].length) - 1, bottom = arr.length - 1;

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;
            System.out.println();
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            System.out.println();
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;
            System.out.println();

            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left]+" ");


            }
            left++;

        }

    }
}

    