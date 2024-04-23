package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 24/02/24
 * Time : 5:43 pm
 * Project_Name : java_core
 */

public class r25 {
    public static void main(String[] args) {
//        int[] arr = new int[]{6, 6, 6, 6, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6,6, 6, 6, 6};

        int[] arr = new int[]{6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[hi]) {
                hi = mid;
            } else if (arr[mid] > arr[hi]) {
                lo = mid + 1;
            } else {
                hi--;
            }

        }
        System.out.println(arr[lo]);
    }
}


//        if (arr[lo] <=arr[mid]) {
//           if (arr[lo] > arr[hi])
//           {
//             lo = mid + 1;
//            }else {
//               hi = mid-1;
//             }
//        } else {
//            hi = mid;
//            }
//        }