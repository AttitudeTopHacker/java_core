package com.java.Aug_24_2023;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = NewArray.getArray();
        arr = InsertionSort(arr);
        DisplayArray.display(arr);
        System.out.println("\nenter the search number :-");
        int Search = (new Scanner(System.in)).nextInt();
        binarySearch(arr, Search);

    }

    private static void binarySearch(int[] arr, int search) {
        int beg = 0, end = arr.length - 1, mid = (beg + end) / 2;
        while (beg < end) {
            if (arr[mid] == search) {
                System.out.println("the find element :-");
                break;
            } else if (arr[mid] < search) {
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = (beg + end) / 2;

        }
        if (beg == end) {
            System.out.println("element not find :-");
        }
    }


    private static int[] InsertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i + 1;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = tmp;
                j--;
            }
        }
        return arr;
    }
}
