package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 21/09/23
 * Time : 9:41 pm
 * Project_Name : java_core
 */

public class nextpermution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = arr.length - 2;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                k--;
            } else {
                break;
            }
        }
        if (k == -1) {
            revers(0, arr.length-1, arr);
            for (int i = 0; i <arr.length; i++) {
                System.out.println(arr[i]);
            }
            return;
        }
        for (int i = arr.length-1; i >0 ; i--) {
            if (arr[i]>arr[k+1]){
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
                break;
            }
        }
        revers(k+1, arr.length-1,arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] +" ");
        }
return;
    }

    private static void revers(int i, int length, int[] arr) {
        while (i < length) {
            int tmp = arr[i];
            arr[i] = arr[length];
            arr[length] = tmp;
            i++;
            length--;
        }
    }
}

    