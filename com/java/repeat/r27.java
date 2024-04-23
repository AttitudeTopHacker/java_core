package com.java.repeat;



public class r27 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        System.out.println(findingIndexi(arr));

    }

    private static int findingIndexi(int[] arr) {
        int lo = 0, hi = arr.length - 1;
        int mid;

        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (mid == 0 || arr[mid] > arr[mid - 1] && mid == arr.length - 1 || arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }


}
