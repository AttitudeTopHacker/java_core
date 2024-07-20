package com.java.codeAssignment.fourthAssignment;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            long N = sc.nextLong();
            int K = sc.nextInt();
            System.out.println(KHTROOT(N, K));
        }
    }

    private static long KHTROOT(long N, int k) {
        long lo = 0;
        long hi = N;
        long ans = Long.MIN_VALUE;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            if (N >= (long) Math.pow(mid, k)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
