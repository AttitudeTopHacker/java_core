package com.java.codeAssignment.fourthAssignment;

import java.util.Arrays;
import java.util.Scanner;


//You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.
//Input Format
//
//First line contains integer t as number of test cases. Next t lines contains two lines. For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.
//        Constraints
//
//1 < t < 50
//        1< n < 100
//        1< m <= 50
//        1 <= Ai <= 1000
//Output Format
//
//Print the maximum number of pages that can be assigned to students.
//Sample Input
//
//1
//        4 2
//        12 34 67 90
//
//Sample Output
//
//113
//
//Explanation
//
//1st students : 12 , 34, 67 (total = 113)
//        2nd students : 90 (total = 90)
//Print max(113, 90)


public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int student = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int totalPage = 0;
            for (int i = 0; i < N; i++) {
                totalPage = totalPage + arr[i];
            }
            int lo = 0;
            int hi = totalPage;
            int ans = 0;
            while (lo <= hi) {
                int mid =lo+ (hi-lo) / 2;
                if (MaxpossibleNumber(arr, mid, student)) {
                    ans = mid;
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }

    private static boolean MaxpossibleNumber(int[] arr, int mid, int student) {
        int readPage = 0;
        int st = 1;
        for (int i = 0; i < arr.length;) {
            if (mid >= arr[i] + readPage) {
                readPage += arr[i];
                i++;
            } else {
                readPage = 0;
                st++;
            }
            if (st > student) {
                return false;
            }
        }
        return true;
    }
}
