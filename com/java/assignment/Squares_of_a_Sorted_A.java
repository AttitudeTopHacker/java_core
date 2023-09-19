package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 17/09/23
 * Time : 11:05 pm
 * Project_Name : java_core
 */

public class Squares_of_a_Sorted_A {
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

    