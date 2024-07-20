package com.java.codeAssignment.ThirdAssignment;


//
//Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that bubble sorts the array. Print the elements of sorted array.
//
//        1.It reads a number N.
//2.Take Another N numbers as input and store them in an Array.
//        3.Bubble sort the array and print the Array.
//Input Format
//
//Constraints
//
//N cannot be Negative. Range of Numbers can be between -1000000000 to 100000000.
//Output Format
//
//Sample Input
//
//4
//        2
//        -18
//        45
//        30
//
//Sample Output
//
//-18
//        2
//        30
//        45
//


import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i-1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
