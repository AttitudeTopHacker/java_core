package com.java.repeat;

import com.java.Aug_24_2023.NewArray;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 27/02/24
 * Time : 8:10 am
 * Project_Name : java_core
 */

public class r26 {
    public static void main(String[] args) {
        int[] arr = NewArray.getArray();
        MergeSortFun(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void MergeSortFun(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start) / 2;
        MergeSortFun(arr, start, mid);
        MergeSortFun(arr, mid + 1, end);
        merging(arr, start, end, mid);

    }

    private static void merging(int[] arr, int start, int end, int mid) {
        int n1 = (mid - start) + 1;
        int n2 = end - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i = 0, j = 0;
        while (i < n1) {
            left[i] = arr[i + start];
            i++;
        }
        while (j < n2) {
            right[j] = arr[j + mid + 1];
            j++;
        }
        i = 0;
        j = 0;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[start++] = left[i++];
            } else {
                arr[start++] = right[j++];
            }
        }
        while (i < n1) {
            arr[start++] = left[i++];
        }
        while (j < n2) {
            arr[start++] = right[j++];
        }


    }


}

    