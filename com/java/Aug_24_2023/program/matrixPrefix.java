package com.java.Aug_24_2023.program;

import java.util.Scanner;

public class matrixPrefix {

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1,  1, 1}, {1, 1, 1, 1, 1}};
        int[][] prefix = FunPrixmatrix(arr);
        prefix = FunpreFixColWise(prefix);
        int row1, row2, col1, col2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start point row and col number");
        row1 = sc.nextInt();
        col1 = sc.nextInt();
        System.out.println("Enter the end point row and col number");
        row2 = sc.nextInt();
        col2 = sc.nextInt();


        for (int[] ints : prefix) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print("  " + ints[j]);
            }
            System.out.println();
        }
        int sum = 0;

//        for (int i = row1; i <= row2; i++) {
//            if (col1 != 0) {
//                sum += prefix[i][col2] - prefix[i][col1-1];
//            } else {
//                sum += prefix[i][col2];
//            }
//
//        }
        if (row1 > 0 && col1 > 0) {
            System.out.println(prefix[row2][col2] - prefix[row2][col1 - 1] - prefix[row1 - 1][col2] + prefix[row1 - 1][col1 - 1]);
        } else if (row1 > 0 && col1 == 0) {
            System.out.println(prefix[row2][col2] - prefix[row1 - 1][col2]);
        } else if (row1 == 0 && col1 > 0) {
            System.out.println(prefix[row2][col2] - prefix[row2][col1 - 1]);
        }


    }

    private static int[][] FunpreFixColWise(int[][] prefix) {
        for (int i = 0; i < prefix.length; i++) {
            for (int j = 1; j < prefix[i].length; j++) {
                prefix[j][i] = prefix[j - 1][i] + prefix[j][i];
            }
        }
        return prefix;
    }


    private static int[][] FunPrixmatrix(int[][] arr) {
        int[][] prefix = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            prefix[i][0] = arr[i][0];
            for (int j = 1; j < arr[0].length; j++) {
                prefix[i][j] = prefix[i][j - 1] + arr[i][j];
            }
        }
        return prefix;
    }

}
