package com.java.repeat;
import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 20/02/24
 * Time : 10:30 pm
 * Project_Name : java_core
 */

public class r21 {
    public static void main(String[] args) {
//        int[] arr = NewArray.getArray();
        int []arr = new int[]{1,1,-1,1,1,1};
        System.out.println(Arrays.toString(arr));
        int[] pre = getpre(arr);
        for (int num : pre) {
            if (num == pre[arr.length - 1] - num) {
                System.out.println("yes can equal two part sum");
                return;
            }
        }
        System.out.println("NO sum equal");

    }

    private static int[] getpre(int[] arr) {
        int[] arr1 = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr1[i] = sum;
        }
        return arr1;
    }

}

    