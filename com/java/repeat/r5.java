package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 05/02/24
 * Time : 5:37 pm
 * Project_Name : java_core
 */

public class r5 {
    public static void main(String[] args) {
        int[] stall = new int[]{1, 2, 4, 8, 9};
        int cow = 3;
        int ans = -1;
        int lo = stall[0], hi = stall[stall.length - 1];
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (isposiblesit(mid, stall, cow)) {
                lo = mid + 1;
                ans = mid;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean isposiblesit(int mid, int[] stall, int cow) {
        int position = stall[0];
        int cowsit = 1;
        for (int i = 1; i < stall.length; i++) {
            if (stall[i] - position >= mid) {
                cowsit++;
                position = stall[i];
            }
        }
        return cowsit == cow;
    }

}

    