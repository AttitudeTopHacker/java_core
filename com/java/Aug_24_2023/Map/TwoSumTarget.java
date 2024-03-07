package com.java.Aug_24_2023.Map;

import java.util.HashMap;

/**
 * create by  mohd salman
 * Date : 19/11/23
 * Time : 1:42 am
 * Project_Name : java_core
 */

public class TwoSumTarget {
    public static void main(String[] args) {
        int target = 13;
        int[] arr = new int[]{2, 4, 3, 6, 15, 20, 11, 9};

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int partner = target - arr[i];
            if (map.containsKey(partner)) {
                System.out.println(i + "  " + map.get(partner));
                return;
            } else {
                map.put(arr[i], i);
            }
        }
    }
}

    