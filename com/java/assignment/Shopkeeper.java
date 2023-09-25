package com.java.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 20/09/23
 * Time : 2:20 pm
 * Project_Name : java_core
 */

public class Shopkeeper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int customer = scanner.nextInt();
        int[] A = new int[customer];
        int[] k = new int[customer];
        for (int i = 0; i < customer; i++) {
            A[i] = scanner.nextInt();
            k[i] = scanner.nextInt();
            customer--;
        }
        for (int i=0;i<customer;i++){
            customerVshopkeeper(A[i], k[i], arr, num);
        }

    }

    //100 200 400 100
    private static void customerVshopkeeper( int money, int item, int[] arr, int num) {

        int count = 0;
        int moneytemp = 0;
        for (int i = 0; i < num; i++) {
            if (money== arr[i]) {
                count++;
            } else if (moneytemp <= money) {
                moneytemp = moneytemp + arr[i];
                count++;
            }
        }
        if (moneytemp > money) {
            count--;
        }
        Checkitem(item, count);

    }

    private static void Checkitem(int item, int count) {
        if (count >= item) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

//100 200 400 100
