package com.java.Aug_24_2023.stackFile;

import java.util.Arrays;
import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 22/10/23
 * Time : 10:05 am
 * Project_Name : java_core
 */

public class consecutiveSubsequence {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 3, 10, 10,10,10, 10, 4, 4, 5, 7, 7, 7, 2};
        System.out.println(Arrays.toString(RemoveDuplicatedElement(arr)));

    }

    private static int[] RemoveDuplicatedElement(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (st.isEmpty() || st.peek() != arr[i]) {
                st.push(arr[i]);
            } else if (st.peek() == arr[i]) {
                if (arr.length-1==i||arr[i] != arr[i + 1]) {
                 st.pop();
                }
            }

//            if ((i == 0 && arr[i] != arr[i + 1] || i == arr.length - 1 && arr[i]!= arr[arr.length-2]))
//                st.push(arr[i]);
//            else if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
//                st.push(arr[i]);
//            }
        }
        int[] ar = new int[st.size()];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = st.pop();
        }
        return ar;
    }

}

    