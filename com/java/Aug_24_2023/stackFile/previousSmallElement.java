package com.java.Aug_24_2023.stackFile;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 23/10/23
 * Time : 11:25 pm
 * Project_Name : java_core
 */

public class previousSmallElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 6, 3, 5};
        System.out.println(Arrays.toString(findingSmallPreviousElement(arr, arr.length)));
    }

    private static int[] findingSmallPreviousElement(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        int[] ArCopy = new int[n];
        ArCopy[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ArCopy[i] = -1;
            } else {
                ArCopy[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ArCopy;

    }

}

    