package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 13/10/23
 * Time : 12:53 pm
 * Project_Name : java_core
 */

public class AggressiveCow {
    public static void main(String[] args) {
        int[] stall = new int[]{1, 2, 4, 8, 9};
        int cow = 3;
        int lo = stall[0];
        int hi = stall[stall.length - 1];
        int ans = -1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (isItPossibleSitCow(mid, stall, cow)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean isItPossibleSitCow(int mid, int[] stall, int cow) {
        int position = stall[0];
        int c = 1;
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - position >= mid) {
                c++;
                position = stall[i];
            }
        }

        return c == cow;
    }

}