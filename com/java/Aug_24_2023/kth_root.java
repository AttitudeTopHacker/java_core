package com.java.Aug_24_2023;

public class kth_root {
    public static void main(String[] args) {

        System.out.println(kth_rootFun(87, 3));
    }

    private static int kth_rootFun(int n, int k) {    //kth root 87 se kam 3*3*3   3of3 power 3^3 find the binary search
        int ans = 0, beg = 1, end = n;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
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
