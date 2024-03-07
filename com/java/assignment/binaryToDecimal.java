package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 18/09/23
 * Time : 6:13 pm
 * Project_Name : java_core
 */

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (N > 0) {
            int binaryNumber = scanner.nextInt();
            System.out.println(bToD(binaryNumber));
            N--;
        }
    }

    private static int bToD(int binaryNumber) {
        int decimal = 0;
        int p = 0;
        while (binaryNumber > 0) {
            int temp = binaryNumber % 10;
            decimal += temp * (int) Math.pow(2/*base*/, p);
            binaryNumber = binaryNumber / 10;
            p++;
        }
        return decimal;
    }
}

//    4
//            111111
//            101
//            1111
//            00110