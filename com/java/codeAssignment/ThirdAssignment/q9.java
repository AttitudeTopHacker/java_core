package com.java.codeAssignment.ThirdAssignment;


//
//Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that reverses the array. Print the values in reversed array.
//
//        1.It reads a number N.
//2.Take Another N numbers as input and store them in an Array.
//        3.Reverse the elements in the Array.
//        4.Print the reversed Array.
//Input Format
//
//First-line contains a single integer n denoting the size of the array.
//Next, N line contains a single integer denoting the elements of the array.
//Constraints
//
//N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.
//Output Format
//
//Print the elements of the reversed array
//Sample Input
//
//5
//        0
//        4
//        6
//        8
//        9
//


import javax.swing.*;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for (int k = 0; k < N; k++) {
            System.out.println(arr[k]);
        }
    }
}
