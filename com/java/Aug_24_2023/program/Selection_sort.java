package com.java.Aug_24_2023.program;

public class Selection_sort {
    public static void main(String[] args) {
        int[] array = new int[]{2, 5, 1, 7, 3};
        DisplayArray.display(array);

        for (int i = 0; i < array.length; i++) {
            int small = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[small] > array[j]) {
                    small = j;
                }
            }
            int tmp = array[small];
            array[small] = array[i];
            array[i] = tmp;
        }
        System.out.println();
        DisplayArray.display(array);

    }
}
