package com.java.Aug_24_2023.stackFile;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 22/10/23
 * Time : 5:12 pm
 * Project_Name : java_core
 */
//Gfg
public class StockPricePreviousGreatest {
    public static void main(String[] args) {
        int[] arr = new int[]{100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(PreviousElement(arr, arr.length)));
    }

    private static int[] PreviousElement(int[] arr, int n) {

        int[] ar = new int[n];
        Stack<Integer> st = new Stack<>();
        ar[0] = 1;

        st.push(0);
        for (int i = 1; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();

            }
            if (st.isEmpty()) {
                ar[i] = 1;
            } else {
                ar[i] =i-st.peek();


            }
            st.push(i);
        }
        return ar;

    }

}

    