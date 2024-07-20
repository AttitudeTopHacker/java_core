package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;


//
//Implement squareroot(x).
//
//Compute and return the square root of x.
//
//If x is not a perfect square, return floor(sqrt(x)).
//Note: DO NOT USE SQRT FUNCTION FROM STANDARD LIBRARY
//Input Format
//
//An integer A .
//        Constraints
//
//0 <= A <10000000000
//Output Format
//
//Squareroot of A.
//        Sample Input
//
//25
//
//Sample Output
//
//5
//


public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(FindRootFloor(N));
    }

    private static int FindRootFloor(int N) {
        int lo = 0;
        int hi = N;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (N >= Math.pow(mid, 2)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
