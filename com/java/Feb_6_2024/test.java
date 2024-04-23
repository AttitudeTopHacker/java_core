package com.java.Feb_6_2024;

/**
 * create by  mohd salman
 * Date : 10/02/24
 * Time : 6:09 pm
 * Project_Name : java_core
 */

public class test {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5, 3, 2, 6, 7, 8};
        System.out.println(findAllInd(arr, 0, 3));
    }

    private static int findAllInd(int[] arr, int indx, int data) {

        if (arr.length == indx) {
            return -1;
        }
        int lastIndex = findAllInd(arr, indx + 1, data);
        if (lastIndex != -1) {
            return lastIndex;
        } else if (data == arr[indx]) {
            return indx;
        }
        return -1;

    }

}

    