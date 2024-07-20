package com.java.codeAssignment.secondAssignment;

import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (0 < t) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            ShoppingGame(M, N);
            t--;
        }
    }


    private static void ShoppingGame(int M, int N) {
        int i = 1;
        int j = 2;
        while (true) {
            if (M > i) {
                System.out.println("Harshit");
                break;
            }
            if (N >j) {
                System.out.println("Aayush");
                break;
            }
            i += 2;
            j += 2;
        }
    }
}
//    public static void main(String args[]) {
//        Scanner scn = new Scanner(System.in);
//        int T = scn.nextInt();
//        int k = 1;
//        while (k <= T) {
//            int M = scn.nextInt();
//            int N = scn.nextInt();
//            int i = 1;
//            int j = 2;
//            M -= i;
//            N -= j;
//            while (true) {
//                if (M < 0) {
//                    System.out.println("Harshit");
//                    break;
//                }
//                if (N < 0) {
//                    System.out.println("Aayush");
//                    break;
//                }
//                i += 2;
//                j += 2;
//                M -= i;
//                N -= j;
//            }
//
//            k++;
//        }

