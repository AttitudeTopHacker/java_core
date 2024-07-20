package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;


//
//Take as input a two-d array. Wave print it column-wise.
//        Input Format
//
//Two integers R(row) and C(colomn) and further R * C integers(2-d array numbers).
//Constraints
//
//Both R and C are between 1 to 10.
//Output Format
//
//All R * C integers seperated by commas with 'END' wriiten in the end(as shown in example).
//Sample Input
//
//4 4
//        11 12 13 14
//        21 22 23 24
//        31 32 33 34
//        41 42 43 44
//
//Sample Output
//
//11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END
//


public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < C; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < R; j++) {
                    System.out.print(arr[j][i] + ", ");
                }
            } else {
                for (int j = R - 1; j >= 0; j--) {
                    System.out.print(arr[j][i] + ", ");
                }
            }
        }
        System.out.print("END");
    }
}


//11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END