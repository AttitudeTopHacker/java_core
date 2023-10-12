package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 4:09 pm
 * Project_Name : java_core
 */

public class mountainPeekElement {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 10, 7, 3, 1, 0}/*{0, 4, 1, 0}*/;
        System.out.println(findPeek(arr));
    }

    private static int findPeek(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid = -1;
        while (lo < hi) {
            mid = (lo + hi) / 2;
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }
        }
        return mid + 1;
    }

}

    