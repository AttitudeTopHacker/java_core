package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 08/10/23
 * Time : 9:09 am
 * Project_Name : java_core
 */

public class pascal {
    public static void main(String[] args) {
        int n = 6;
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int k=n-i;k>0;k--){
                System.out.print("  ");
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
    