package com.java.codeAssignment.ThirdAssignment;

import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] Arr = new int[n];
            for (int i = 0; i < n; i++) {
                Arr[i] = sc.nextInt();
            }
            Nextpramutation(Arr, n);
        }
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

    private static void Nextpramutation(int[] arr, int n) {
        if (n==0){
            return;
        }
        int k = n - 2;/* k initialize with array.length  */
        for (int i =n - 1; i > 0; i--) {
            /* k indx find kr revers loop check left me jo num hai wo small hai
             agar small hai break ho jaye loop otherwise k--  {1, 3, 2} indx 0,1,2
                                                               <- <- <-           */
            if (arr[i] <= arr[i - 1]) {
                k--;
            } else {
                break;
            }
        }
        if (k == -1) {       /*ye tab chalega jab koi element small nhi mila last permutation thi jo revers
                                        karna hai then finsh*/
            revers(0, n - 1, arr);
            DisplayArr(arr);
            return;
        }
        for (int i = n - 1; i > 0; i--) {/*k indx ko shi jagah rakna 3 2 1 yani decreasing order
         me set kran and k indx se end tak revers karna
        */
            if (arr[k] < arr[i]) {
                int tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;
                break;
            }
        }
        revers(k + 1, arr.length - 1, arr);
        DisplayArr(arr);
    }

    private static void DisplayArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}