package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 09/09/23
 * Time : 6:43 pm
 * Project_Name : java_core
 */

public class First_bad_number {
    public static void main(String[] args) {
        int n = 87;
        System.out.println(FirstBadNumber(n));/*#b*/
        System.out.println(1&3);
    }

    private static int FirstBadNumber(int n) {
        int beg = 1, end = n, ans = 0;
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if (isBadOrNot(mid)) {
                end = mid - 1;
                ans = mid;
            } else beg = mid + 1;
        }
        return ans;
    }

    private static boolean isBadOrNot(int mid) {
        return 3 <= mid;
    }
}

    