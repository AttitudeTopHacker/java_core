package com.java.repeat;


import com.java.Aug_24_2023.program.matrix;

/**
 * create by  mohd salman
 * Date : 05/02/24
 * Time : 6:12 pm
 * Project_Name : java_core
 */

public class r6 {
    public static void main(String[] args) {

        int[][] mat = matrix.NewBinaryMatrix();
        matrix.display(mat);
        int row = mat.length;
        int col = mat[0].length;

        int lo = 0, hi = row * col - 1;
        int search = 33;
        while (lo < hi) {
            int mid = (lo + hi) / 2, element = mat[mid / col][mid % col];
            if (element == search) {
                System.out.println("element found : ");
                break;
            } else if (element < search) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        if (lo > hi) {
            System.out.println("not find :");
        }
    }

}

    