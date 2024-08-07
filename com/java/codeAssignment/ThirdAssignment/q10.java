package com.java.codeAssignment.ThirdAssignment;

/*


Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
Input Format

First line of input contains an integer n representing the length of array n. Next line contains n array elements.
Constraints

1 <= nums.length <= 10^4
        -10^4 <= nums[i] <= 10^4
nums is sorted in non-decreasing order.
Output Format

A sorted array representing squares of elements of nums array.
Sample Input

5
        -4 -1 0 3 10

Sample Output

0 1 9 16 100

Explanation

        After squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100]



*/

import java.util.Arrays;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        squares(array);
        Arrays.sort(array);
        for (int e : array) {
            System.out.print(e+" ");
        }
    }

    private static void squares(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i]*array[i];
        }

    }
}
