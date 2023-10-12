package com.java.Aug_24_2023.recursion;

import java.util.ArrayList;

/**
 * create by  mohd salman
 * Date : 30/09/23
 * Time : 5:45 pm
 * Project_Name : java_core
 */

public class findIndex {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 3, 2, 3, 3, 4, 6, 4, 3, 2, 24, 4, 4, 4, 5, 5, 5, 13, 3, 3};
        System.out.println(finding(arr, 0, 4));
    }

    private static ArrayList<Integer> finding(int[] arr, int indx, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (arr.length == indx) {
            return ans;
        }
        if (arr[indx] == target) {
            ans.add(indx);
        }
        ArrayList<Integer> smal = finding(arr, indx + 1, target);
        ans.addAll(smal);
        return ans;
    }
}

    