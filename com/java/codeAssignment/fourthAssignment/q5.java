package com.java.codeAssignment.fourthAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//
//Take as input a 2-d array.Print the 2-D array in sprial form clockwise.
//Input Format
//
//Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).
//Constraints
//
//Both M and N are between 1 to 100.
//Output Format
//
//All M * N integers separated by commas with 'END' written in the end(as shown in example).
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
//11, 12, 13, 14, 24, 34, 44, 43, 42, 41, 31, 21, 22, 23, 33, 32, END
//


public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int top = 0, left = 0, right = arr[0].length - 1, bottom = arr.length - 1;
        List<Integer> li = new ArrayList<>();

        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + ", ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + ", ");
            }
            right--;
            if (left <= right && top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + ", ");
                }
                bottom--;

                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + ", ");
                }
                left++;
            }
        }
        System.out.print("END");
    }
}
