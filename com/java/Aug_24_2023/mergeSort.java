package com.java.Aug_24_2023;


import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 03/10/23
 * Time : 7:42 am
 * Project_Name : java_core
 */

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = NewArray.getArray();
        System.out.println("before sorting :-\n" + Arrays.toString(arr));
        Merge_sorting(arr, 0, arr.length - 1);
        System.out.println("after sorting :-\n" + Arrays.toString(arr));

    }

    private static void Merge_sorting(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (r - l) / 2 + l;
        Merge_sorting(arr, l, mid);
        Merge_sorting(arr, mid + 1, r);
        Sort(arr, l, r, mid);
    }

    private static void Sort(int[] arr, int l, int r, int mid) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        int i = 0, j = 0;
        while (i < left.length) {
            left[i] = arr[i + l];
            i++;
        }
        while (j < right.length) {
            right[j] = arr[mid + 1 + j];
            j++;
        }
        i = 0;
        j = 0;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[l] = left[i];
                l++;
                i++;
            } else {
                arr[l] = right[j];
                l++;
                j++;
            }
        }
        while (i < n1) {
            arr[l] = left[i];
            l++;
            i++;
        }
        while (j < n2) {
            arr[l] = right[j];
            l++;
            j++;
        }
    }
}

    