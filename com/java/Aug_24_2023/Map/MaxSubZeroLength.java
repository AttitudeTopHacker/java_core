package com.java.Aug_24_2023.Map;

import java.util.HashMap;

/**
 * create by  mohd salman
 * Date : 19/11/23
 * Time : 2:59 pm
 * Project_Name : java_core
 */

public class MaxSubZeroLength {
    public static void main(String[] args) {
//        int[] arr = new int[]{15, -2, 2, -8, 1, 7, 10 ,-25};
        int[] arr = new int[]{333, -736, 49, 803, 474, 910, 464, -203, -592, 320, -545, 246, -632, 778, 116, -347, 93, -611, -364, -130, -69, -714, 187, -422, 958, 222, -581, -221, -751, 90, 872, 19, 228, 456, -748, -133, 684, 703, 475, -648, 224, -638, 394, -724, 214, -363, 957, -751, 718, -479, 851, -285, 169, 404, -470, -777, -977, 556, 280, 869, 800, -281, 320, -290, -593, 208, 90, -329, -836, 605, -488, -57, -799, 192, 247, -275, -995, -152, 946, -55, 568, 689, 110, 620, -455, 959, -605, -117, -981, 542, -72, -625, -727, -736, 577, 566};
        System.out.println(Mxlength(arr, arr.length));
    }

    private static int Mxlength(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ml = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = 15;
        map.put(0, -1);
        map.put(prefix[0], 0);
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
            if (map.containsKey(prefix[i])) {
                if (ml < i - map.get(prefix[i])) {
                    ml = i - map.get(prefix[i]);
                }
            } else {
                map.put(prefix[i], i);
            }
        }
        return ml;
    }
}

    