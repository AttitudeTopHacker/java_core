package com.java.codeAssignment.ThirdAssignment;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



import java.util.Arrays;
import java.util.Scanner;

public class q18 {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        int i;
        for(i = 0; i < n; ++i) {
            arr[i] = scn.nextInt();
        }

        sortColors(arr);

        for(i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }

    }

    public static void sortColors(int[] nums) {
        Arrays.sort(nums);
    }
}
