package com.java.Feb_6_2024;

/**
 * create by  mohd salman
 * Date : 06/02/24
 * Time : 12:59 am
 * Project_Name : java_core
 */

public class firstIndexRecursion {
    public static void main(String[] args) {
        int[] ar = new int[]{2, 3, 4, 5, 3, 2, 6, 7, 8};
        System.out.println(firstAccurence(ar, 3, 0));
    }

    private static int firstAccurence(int[] ar, int data, int indx) {
        if (ar.length == indx) {
            return -1;
        }
//        int first = firstAccurence(ar, data, indx + 1);

        if (ar[indx] == data) {
            return indx;
        } else {
            int first = firstAccurence(ar, data, indx + 1);
            return first;
        }
    }

}

    