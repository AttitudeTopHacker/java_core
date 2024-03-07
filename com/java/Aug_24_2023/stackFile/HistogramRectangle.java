package com.java.Aug_24_2023.stackFile;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 23/10/23
 * Time : 11:37 pm
 * Project_Name : java_core
 */

public class HistogramRectangle {
    public static void main(String[] args) {
//                            0  1  2  3  4  5
        int[] arr = new int[]{2, 1, 5, 6, 2, 3};/*{5, 2, 4, 6, 3, 5};*/
        System.out.println(HistogramRectangleFun(arr, arr.length));
    }

    private static int HistogramRectangleFun(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] pre = new int[n];
        int[] next = new int[n];
        pre[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                pre[i] = -1;
            } else pre[i] = st.peek();
            st.push(i);
        }
        System.out.println(Arrays.toString(pre));
        while (!st.isEmpty()) {
            st.pop();
        }
        next[n - 1] = n;
        st.push(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(next));
        int max = -1;
        for (int i = 0; i < n; i++) {
            int ans = (next[i] - pre[i] - 1) * arr[i];
            max = Math.max(ans, max);
        }
        return max;
    }
}

    