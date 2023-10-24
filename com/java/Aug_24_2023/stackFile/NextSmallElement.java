package com.java.Aug_24_2023.stackFile;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 23/10/23
 * Time : 6:07 pm
 * Project_Name : java_core
 */

public class NextSmallElement {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 2, 4, 6, 3, 5};
        System.out.println(Arrays.toString(FindSmallElement(arr)));
    }

    private static int[] FindSmallElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] arCopy = new int[n];
        arCopy[n - 1] = -1;
        st.push(arr[n - 1]);

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() > arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arCopy[i] = -1;
            } else {
                arCopy[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return arCopy;
    }

}

    