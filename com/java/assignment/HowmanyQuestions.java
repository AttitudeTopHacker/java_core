package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 6:06 am
 * Project_Name : java_core
 */

public class HowmanyQuestions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = 0;
        while (N > 0) {
            int p, v, t;
            p = scanner.nextInt();
            v = scanner.nextInt();
            t = scanner.nextInt();
            if (p == 1 && v == 1 || p == 1 && t == 1 || v == 1 && t == 1)
                q++;
            N--;
        }
        System.out.println(q);
    }
}

    