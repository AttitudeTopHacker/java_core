package com.java.codeAssignment.ThirdAssignment;

import java.util.Arrays;
import java.util.Scanner;


//
//Sort just 0 and 1
//Input Format
//
//A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space
//        Constraints
//
//N will not exceed 10^7
//Output Format
//
//Sorted Sequence
//Sample Input
//
//7
//        1 0 0 1 1 0 1
//
//Sample Output
//
//0 0 0 1 1 1 1
//



public class q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        byte[] array = new byte[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextByte();
        }
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
