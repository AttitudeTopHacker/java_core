package com.java.Aug_24_2023.program;

import java.util.Scanner;

public class kth_root {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {

            long N = sc.nextLong();
            int K = sc.nextInt();
            System.out.println(kth_rootFun(N, K));
        }

    }

    private static long kth_rootFun(long n, int k) {    //kth root 87 se kam 3*3*3   3of3 power 3^3 find the binary search
        long ans = 0, beg = 1, end = n;
        while (beg <= end) {
            long mid = beg + (end - beg) / 2;
            if (Math.pow(mid, k) <= n) {
                beg = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
