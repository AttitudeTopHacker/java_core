package com.java.repeat;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 21/02/24
 * Time : 7:39 am
 * Project_Name : java_core
 */

public class r22 {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 2};
        int n = array.length;
        int[] prefix = new int[n], suffix = new int[n];
        prefix[0] = 1;
        suffix[n - 1] = 1;
        for (int i = 1; i < array.length; i++) {
            prefix[i] = array[i-1] * prefix[i - 1];
            suffix[n-i-1] = array[n - i ] * suffix[n -i];
        }
        for (int i = 0; i < array.length; i++) {
        array[i]=prefix[i]*suffix[i];
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        System.out.println(Arrays.toString(array));
    }


}



    