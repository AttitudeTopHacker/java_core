package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 4:26 am
 * Project_Name : java_core
 */

public class pairRoses {
    public static void main(String[] args) {
        Scanner sct = new Scanner(System.in);
        int t = sct.nextInt();
        while (t > 0) {
            int num = sct.nextInt();
            int[] array = new int[num];
            for (int i = 0; i < array.length; i++) {
                array[i] = sct.nextInt();
            }
            Arrays.sort(array);
            int M = sct.nextInt();
            int l = 0, r = num - 1, i = 0, j = 0;
            while (l < r) {
                if (array[l] + array[r] == M) {
                    i = array[l];
                    j = array[r];
                    l++;
                    r--;
                } else if (array[l] + array[r] < M) {
                    l++;

                } else {
                    r--;
                }

            }
            if (i != 0) {
                System.out.println("Deepak should buy roses whose prices are " + i + " and " + j + ".");
            }
            t--;
        }
    }
}

    