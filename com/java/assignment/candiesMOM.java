package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 5:34 am
 * Project_Name : java_core
 */

public class candiesMOM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T > 0) {

            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int tmp=x%n;

                System.out.println(Math.min(tmp,n-tmp));

            T--;
        }
    }


}

    