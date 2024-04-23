package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 6:55 pm
 * Project_Name : java_core
 */

public class miniReadPage_book {
    public static void main(String[] args) {

        int[] pages = new int[]{10, 20, 30, 40};
        int sum = 0;
        int Nos = 2;
        for (int page : pages) {
            sum += page;
        }
        int ans = 0;
        int hi = sum;
        int lo = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isPossibleReading(pages, mid, Nos)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean isPossibleReading(int[] pages, int mid, int nos) {
        int countStudent = 1;
        int reading = 0;
        for (int i = 0; i < pages.length; i++) {
            if (mid >= pages[i] + reading) {
                reading = reading + pages[i];
            } else {
                reading = 0;
                i--;
                countStudent++;
            }
            if (countStudent > nos) {
                return false;
            }
        }
        return true;
    }
}