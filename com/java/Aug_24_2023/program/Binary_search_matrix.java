package com.java.Aug_24_2023.program;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 10/09/23
 * Time : 10:01 am
 * Project_Name : java_core
 */

public class Binary_search_matrix {
    public static void main(String[] args) {
//        int[][] arr = matrix.NewBinaryMatrix();
//        int row = arr[0].length, col = arr.length;
//        int beg = 0, end = row * col - 1;
//        System.out.println(arr[0].length);
//        matrix.display(arr);
//        System.out.println();
//        System.out.println("enter the search in the matrix number:-");
//        int search = (new Scanner(System.in)).nextInt();
//        while (beg <= end) {
//            int mid = beg + (end - beg) / 2;
//            int element = arr[mid / row][mid % row];
//            if (element == search) {
//                System.out.println(search + " find the element:-");
//                break;
//            } else if (element < search) {
//                beg = mid + 1;
//
//            } else end = mid - 1;
//        }
//        if (beg > end) {
//            System.out.println("not find :-");
//        }

        System.out.println("Matrix row wise and col wise :-");
        RowWiseCol();

    }

    private static void RowWiseCol() {
        int[][] arr = matrix.NewBinaryMatrix();
        matrix.display(arr);
        System.out.println("enter the find element number:-");
        int search = (new Scanner(System.in)).nextInt();
        int row = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[row][0] == search) {
                System.out.println("the element found :-");
                return;
            }
            if (arr[i][0] < search) {
                row = i;
            } else {
                row = row - 1;
                break;
            }
            System.out.println(arr[row][0]);
        }
        System.out.println("row  " + row);
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] == search) {
                System.out.println("yes element found it :-");
                return;
            }
            System.out.println(arr[row][i]);
        }
        System.out.println("not found it ");
    }
}

    