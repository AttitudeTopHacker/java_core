package com.java.Aug_24_2023;

/*
 * create by  mohd salman
 * Date : 21/09/23
 * Time : 9:41 pm
 * Project_Name : java_core
 */

import java.util.Arrays;


public class nextpermution {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(Arrays.toString(arr));
        Nextper(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void Nextper(int[] arr) {
        int k = arr.length - 2;/* k initialize with array.length  */
        for (int i = arr.length - 1; i > 0; i--) {
            /* k indx find kr revers loop check left me jo num hai wo small hai
             agar small hai break ho jaye loop otherwise k--  {1, 3, 2} indx 0,1,2
                                                               <- <- <-           */
            if (arr[i] < arr[i - 1]) {
                k--;
            } else {
                break;
            }
        }
        if (k == -1) {       /*ye tab chalega jab koi element small nhi mila last permutation thi jo revers
                                        karna hai then finsh*/
            revers(0, arr.length - 1, arr);
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--) {/*k indx ko shi jagah rakna 3 2 1 yani decreasing order
         me set kran and k indx se end tak revers karna
        */
            if (arr[k] < arr[i]) {
                System.out.println("k = " + arr[k]);
                System.out.println("k = " + arr[i]);
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
                break;
            }
        }
        revers(k + 1, arr.length - 1, arr);
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
