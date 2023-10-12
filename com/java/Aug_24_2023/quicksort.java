package com.java.Aug_24_2023;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 10/10/23
 * Time : 8:38 am
 * Project_Name : java_core
 */

public class quicksort {
    public static void main(String[] args) {
        int[] brr =new int[]{3,9,4,3,1,8,2,8};
//        NewArray.getArray();
        quicksorts(brr, 0, brr.length-1);
        System.out.println(Arrays.toString(brr));

    }

    private static void quicksorts(int[] brr, int l, int r) {
        if (r <= l) {
            return;
        }
        int pi = partition(brr, l, r);
        quicksorts(brr, l, pi - 1);
        quicksorts(brr, pi + 1, r);
    }

    private static int partition(int[] brr, int l, int r) {
        int pivotElement = brr[l], cnt = 0;
        for (int i = l + 1; i <= r; i++) {
            if (pivotElement > brr[i]) {
                cnt++;
            }
        }
        int pivotIndx = l + cnt;
        Swapfun(brr, pivotIndx, l);
        int i = l, j = r;
        while (i < pivotIndx && j > pivotIndx) {
            if (brr[i] > pivotElement && brr[j] < pivotElement) {
                Swapfun(brr, i, j);
                i++;
                j--;
            }
            if (brr[i] <= pivotElement) {
                i++;
            }else {
                j--;
            }
//            while (brr[i] <= pivotElement) {
//                i++;
//            }
//            while (brr[j] > pivotElement) {
//                j--;
//
//            }
//            if(i < pivotIndx && j > pivotIndx){
//                Swapfun(brr, i, j);
//                i++;
//                j--;
//            }
        }


        return pivotIndx;
}

    private static void Swapfun(int[] brr, int cnt, int i) {
        int tmp = brr[i];
        brr[i] = brr[cnt];
        brr[cnt] = tmp;
    }
}

    