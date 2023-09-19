package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 12:59 pm
 * Project_Name : java_core
 */

public class NextPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {
            int N = scanner.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();
            }
            int k = N - 2;
            if(arr.length == 0){
                return;
            }
            for (int i = N - 1; i > 0; i--) {
                if (arr[i] <= arr[i - 1]) {
                    k--;
                } else {
                    break;
                }
            }
            if (k == -1) {
                ReversPermutation(0, N - 1, arr);
                PrintFun(arr,N);
                return;
            }

            for (int i = N - 1; i > 0; i--) {
                if (arr[i] > arr[k]) {
                    int tmp = arr[i];
                    arr[i] = arr[k];
                    arr[k] = tmp;
                    break;
                }
            }
            ReversPermutation(k + 1, N - 1, arr);
            PrintFun(arr,N);

            T--;
        }
    }

    private static void PrintFun(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void ReversPermutation(int start, int N, int[] arr) {
        while (start < N) {
            int tmp = arr[start];
            arr[start] = arr[N];
            arr[N] = tmp;
            start++;
            N--;
        }
    }
}

    