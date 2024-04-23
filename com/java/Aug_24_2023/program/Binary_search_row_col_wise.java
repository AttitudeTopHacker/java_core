package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 12/09/23
 * Time : 4:53 pm
 * Project_Name : java_core
 */

public class Binary_search_row_col_wise {
    public static void main(String[] args) {
        int[][] arr = matrix.NewBinaryMatrixRowCol();
        matrix.display(arr);
        int row = 0, col = arr[0].length - 1;
        int search = 33;
//        int search = new Scanner(System.in).nextInt();
        while (col >=0 && row < arr.length) {
            System.out.println(arr[row][col]);
            if (arr[row][col] == search) {
                System.out.println("element found :-");
                return;
            } else if (arr[row][col] < search) {
                row++;
            } else {
                col--;

            }
        }
        System.out.println("element not find:-");



    }
}

    