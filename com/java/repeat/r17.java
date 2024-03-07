package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 19/02/24
 * Time : 7:27 pm
 * Project_Name : java_core
 */

public class r17 {
    public static void main(String[] args) {
        int[] pages = new int[]{10, 20, 30, 40};
        int sum = 0;
        int Nos = 2, ans = 0;
        for (int page : pages) {
            sum += page;
        }
        int hi = sum, lo = 0;
        while (lo < hi) {
            int mid = (hi - lo) / 2 + lo;
            if (itsPossible(pages, mid, Nos)) {
                hi = mid - 1;
                ans = mid;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(ans);


    }

    private static boolean itsPossible(int[] pages, int mid, int nos) {
        int read = 0, student = 1;   //first minimum page read the mid ke braber ya usse kam total read page
        // 100 ture
        for (int i = 0; i < pages.length; i++) {
            if (mid >= pages[i] + read) {
                read += pages[i];
            } else {
                student++;
                read = 0;
                i--;
            }
            if (student > nos)
                return false;
        }
        return true;
    }

}

    