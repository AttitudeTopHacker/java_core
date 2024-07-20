package com.java.codeAssignment.ThirdAssignment;


//
//Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array
//Input Format
//
//Enter a number N and take N more inputs
//Constraints
//None

//Output Format
//
//Display the values of the inverted array in a space separated manner
//Sample Input
//
//5
//        0 2 4 1 3
//
//Sample Output
//
//0 3 1 4 2
//

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
//        0 1 2 3 4 index
//        0 2 4 1 3  data
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            temp[arr[i]] = i;
        }
        //    0 1 2 3 4  data
        //    0 2 4 1 3  index


        for (int i = 0; i < N; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
