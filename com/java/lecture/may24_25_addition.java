package com.java.lecture;

import java.util.ArrayList;

public class may24_25_addition {
    public static void main(String[] args) {
        int[] arr1 = {5, 8, 9, 9, 7, 6};
        int[] arr2 = {9, 4, 7};
        int i = arr1.length - 1, j = arr2.length - 1;
        ArrayList<Integer> list = new ArrayList<>();
        int cary = 0;
        while (i >= 0 && j >= 0) {
            int sum = arr1[i] + arr2[j] + cary;
            list.addFirst(sum % 10);
            cary = sum / 10;
            i--;
            j--;
        }
        while (i >= 0) {
            int sum = arr1[i] + cary;
            list.addFirst(sum % 10);
            cary = sum / 10;
            i--;
        }
        while (j >= 0) {
            int sum = arr2[j] + cary;
            list.addFirst(sum % 10);
            cary = sum / 10;
            j--;
        }
        list.addFirst(cary);
        System.out.println(list);
    }
}
