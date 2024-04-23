package com.java.repeat;

import com.java.Aug_24_2023.recursion.SwapFun;

import java.util.Arrays;

public class r29 {
    public static void main(String[] args) {
        int[] brr = new int[]{3, 9, 4, 3, 1, 8, 2, 8};
//        NewArray.getArray();
        quicksorts(brr, 0, brr.length - 1);
        System.out.println(Arrays.toString(brr));
    }

    private static void quicksorts(int[] brr, int l, int r) {
        if (l >= r) {
            return;
        }
        int pi = PivotIndexFind(brr, l, r);
        quicksorts(brr, l, pi - 1);
        quicksorts(brr, pi + 1, r);
    }

    private static int PivotIndexFind(int[] brr, int l, int r) {
        int pi = brr[r], count = l - 1;
        for (int i = l; i < r; i++) {
            if (pi > brr[i]) {
                count++;
                System.out.println(i);
                SwapFun.swapping(brr, count, i);
            }
        }
        System.out.println(count);
        SwapFun.swapping(brr, ++count, r);
        return count;
    }
}
