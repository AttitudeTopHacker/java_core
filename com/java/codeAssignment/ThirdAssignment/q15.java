package com.java.codeAssignment.ThirdAssignment;


//
//Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that selection sorts the array. Print the elements of sorted array.
//
//        1.It reads a number N.
//2.Take Another N numbers as input and store them in an Array.
//        3.Sort the array using Selection Sort and print that Array.
//Input Format
//
//Constraints
//
//N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.
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

public class q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
