package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;

//
//Given an n x m matrix, where every row and column is sorted in increasing order, and a number x . Find if element x is present in the matrix or not.
//        Input Format
//
//First line consists of two space separated integers N and M, denoting the number of element in a row and column respectively. Second line of each test case consists of N*M space separated integers denoting the elements in the matrix in row major order. Third line of each test case contains a single integer x, the element to be searched.
//        Constraints
//
//1 <= N,M <= 30 0 <= A[i] <= 100
//Output Format
//
//Print 1 if the element is present in the matrix, else 0.
//Sample Input
//
//3 3
//        3 30 38
//        44 52 54
//        57 60 69
//        62
//
//Sample Output
//
//0
//

public class q4 {
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
        int target = sc.nextInt();
        System.out.println(findingTarget (arr, R,C,target));
    }

    private static int findingTarget(int[][] arr, int R, int C, int target) {

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == target){
                    return arr[i][j];
                }
            }
        }
        return 0;
    }
}
