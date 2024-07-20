package com.java.codeAssignment.ThirdAssignment;


//
//You are provided two sorted arrays. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.
//link
//Input Format
//
//First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.
//        Constraints
//
//1<=t<=100 1<=n,m, nums1[i], num2[i]<=100000
//Output Format
//
//Print the maximum path Sum.
//        Sample Input
//
//2
//        8 8
//        2 3 7 10 12 15 30 34
//        1 5 7 8 10 15 16 19
//        5 4
//        2 4 5 8 10
//        4 6 8 9
//

/*      1
        8 8
        2 3 7 10 12 15 30 34
        1 5 7 8 10 15 16 19*/

//Sample Output
//
//122
//30
//
//Explanation
//
//Test Case1 Explanation :- 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34


import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[] numb1 = new int[m];
            int[] numb2 = new int[n];
            for (int i = 0; i < numb1.length; i++) {
                numb1[i] = sc.nextInt();
            }
            for (int i = 0; i < numb2.length; i++) {
                numb2[i] = sc.nextInt();
            }
            FindOutSumPath(numb1, numb2);
        }

    }

    private static void FindOutSumPath(int[] numb1, int[] numb2) {
        int sum1 = 0, sum2 = 0, ans = 0;
        int i = 0, j = 0;
        while (i < numb1.length && j < numb2.length) {
            if (numb1[i] < numb2[j]) {
                sum1 += numb1[i++];
            } else if (numb1[i] > numb2[j]) {
                sum2 += numb2[j++];
            } else {
                ans += Math.max(sum1, sum2);
                sum1 = 0;
                sum2 = 0;
                while (numb1[i] == numb2[j]) {
                    ans += numb1[i];
                    i++;
                    j++;
                }
            }
        }
        while (i < numb1.length) {
            ans += numb1[i++];
        }
        while (j < numb2.length) {
            ans += numb2[j++];
        }
        System.out.println(ans);
    }
}
