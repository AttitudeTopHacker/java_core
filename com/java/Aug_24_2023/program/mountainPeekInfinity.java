package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 5:38 pm
 * Project_Name : java_core
 */

public class mountainPeekInfinity {
    public static void main(String[] args) {
//                            0  1  2  3  4  5  6
        int arr[] = new int[]{1, 2, 1, 3, 5, 6, 4};
        System.out.println(FindThePeekIndex(arr));
    }

    private static int FindThePeekIndex(int[] arr) {
        int ans = -1;
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (arr[mid] > arr[mid+1] || mid == arr.length - 1)) {
                return mid;
            } else if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

}

    