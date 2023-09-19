package com.java.assignment;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 18/09/23
 * Time : 6:22 am
 * Project_Name : java_core
 */

public class Running_Sum_of_the_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        RunningSum(array);
        for (int e : array) {
            System.out.print(e + " ");
        }
    }

    private static void RunningSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + array[i];
        }

    }
}

    