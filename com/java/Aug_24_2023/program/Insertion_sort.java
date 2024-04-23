package com.java.Aug_24_2023.program;

public class Insertion_sort {
    public static void main(String[] args) {

        int[] arr = NewArray.getArray();
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int tmp = arr[j - 1];
                arr[j - 1] = arr[j];
                    arr[j] = tmp;
                j--;
            }
        }
        DisplayArray.display(arr);
    }
}
