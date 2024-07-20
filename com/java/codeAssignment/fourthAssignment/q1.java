package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;


//
//
//Take as input a two-d array. Wave print it row-wise.
//        Input Format
//
//Two integers M(row) and N(column) and further M * N integers(2-d array numbers).
//Constraints
//
//Both M and N are between 1 to 10.
//Output Format
//
//All M * N integers are seperated by commas with 'END' written in the end(as shown in example).
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
//11, 12, 13, 14, 24, 23, 22, 21, 31, 32, 33, 34, 44, 43, 42, 41, END
//

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int row = 0;
        while (row < N) {
            for (int j = 0; j < M; j++) {
                System.out.print(arr[row][j] + ", ");
            }
            row++;
            for (int j = M - 1; j >= 0 && row < N; j--) {
                System.out.print(arr[row][j] + ", ");
            }
            row++;
        }
        System.out.print("END");
    }
}
