package com.java.Aug_24_2023;

public class Bubble_Sort {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[]{3, 2, 7, 1, 8};
        System.out.println("array before sorted :-");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println("\narray after sorted :-");
        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
