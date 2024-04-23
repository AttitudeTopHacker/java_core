package com.java.Aug_24_2023.program;

import com.java.Aug_24_2023.recursion.SwapFun;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * create by  mohd salman
 * Date : 03/10/23
 * Time : 2:04 pm
 * Project_Name : java_core
 */

public class m {
    public static void main(String[] args) {
        int[] arr =new int[]{3,9,4,3,1,8,2,8} /*NewArray.getArray()*/;
        System.out.println(Arrays.toString(arr));
//        SortingFun(arr, 0, arr.length - 1);

        QuickSorting(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private static void QuickSorting(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int pi = PartitionIndex(arr, l, r);
        QuickSorting(arr, l, pi - 1);
        QuickSorting(arr, pi + 1, r);
    }

    private static int PartitionIndex(int[] arr, int l, int r) {
        int cnt = 0, pivotElement, pivotIndex;
        pivotElement = arr[l];
        for (int i = l + 1; i <= r; i++) {
            if (pivotElement > arr[i]) {
                cnt++;
            }
        }
        pivotIndex = l + cnt;
        SwapFun.swapping(arr, l, pivotIndex);
        int i = l, j = r;
        while (i < pivotIndex && pivotIndex < r) {
            if (arr[i] >= pivotElement && arr[r] <= pivotIndex) {
                SwapFun.swapping(arr, i, r);
                i++;
                r--;
            }
            if (arr[i] <= pivotElement) {
                i++;
            } else{
                r--;
            }
        }
        return pivotIndex;
    }

    private static void SortingFun(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2; /*(r - l) / 2 + l;*/
        SortingFun(arr, l, mid);
        SortingFun(arr, mid + 1, r);
        merging(arr, l, r, mid);

    }

    private static void merging(int[] arr, int l, int r, int mid) {
        int n1, n2;
        n1 = (mid - l) + 1;
        n2 = r - mid;
        int[] let = new int[n1];
        int[] rit = new int[n2];
        int i = 0, j = 0;
        while (i < let.length) {
            let[i] = arr[i + l];
            i++;
        }
        while (j < rit.length) {
            rit[j] = arr[mid + 1 + j];
            j++;
        }
        i = 0;
        j = 0;
        while (i < n1 && j < n2) {
            if (let[i] <= rit[j]) {
                arr[l++] = let[i++];
            } else {
                arr[l++] = rit[j++];
            }
        }
        while (i < n1) {
            arr[l++] = let[i++];
        }
        while (j < n2) {
            arr[l++] = rit[j++];
        }

    }
}

    