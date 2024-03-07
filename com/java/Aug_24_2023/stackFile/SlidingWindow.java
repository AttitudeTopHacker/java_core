package com.java.Aug_24_2023.stackFile;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 06/11/23
 * Time : 3:30 pm
 * Project_Name : java_core
 */

public class SlidingWindow {
    public static void main(String[] args) {
//                   0  1   2   3  4  5  6  7  8
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println(Arrays.toString(MaxSliding(nums, k)));
    }

    public static double[] MaxSliding(int[] arr, int k) {
        int[] NextEle = NextGreaterEle(arr, arr.length);
        System.out.println(Arrays.toString(NextEle));
        int Size = arr.length - k + 1;
        double[] window = new double[Size];

        for (int i = 0; i < Size; i++) {
            int j = i;
            int Max = arr[i];
            while (j < i + k) {
                Max = arr[j];
                j = NextEle[j];
            }
            window[i] = Max;

        }
        return window;
    }


    private static int[] NextGreaterEle(int[] arr, int N) {
        Stack<Integer> stack = new Stack<>();
        int[] NextEle = new int[arr.length];
        NextEle[N - 1] = N;
        stack.push(N - 1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] >= arr[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                NextEle[i] = N;
            } else {
                NextEle[i] = stack.peek();
            }
            stack.push(i);
        }
        return NextEle;
    }

}

    