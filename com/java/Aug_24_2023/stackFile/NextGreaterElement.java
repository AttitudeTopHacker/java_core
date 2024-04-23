package com.java.Aug_24_2023.stackFile;


import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 22/10/23
 * Time : 11:39 am
 * Project_Name : java_core
 */

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println(Arrays.toString(GreaterElement(arr)));
    }

    private static int[] GreaterElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ar = new int[arr.length];
        ar[n - 1] = -1;
        st.push(arr[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) ar[i] = -1;
            else ar[i] = st.peek();
            st.push(arr[i]);

        }
        return ar;
    }

}

    