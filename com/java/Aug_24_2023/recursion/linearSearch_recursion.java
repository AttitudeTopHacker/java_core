package com.java.Aug_24_2023.recursion;

/**
 * create by  mohd salman
 * Date : 29/09/23
 * Time : 7:03 am
 * Project_Name : java_core
 */

public class linearSearch_recursion {
    public static void main(String[] args) {
        System.out.println(SearchRecursion(new int[]{3, 2, 6, 9, 11, 20, 4, 8, 7}, 0, 4));
    }

    private static int SearchRecursion(int[] arr, int index, int target) {
        if (arr.length == index) {
            return -1;
        }

        if (arr[index] == target)
            return target;
        return SearchRecursion(arr, index + 1, target) ;

    }
}

    