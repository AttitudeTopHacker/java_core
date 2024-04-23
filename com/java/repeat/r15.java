package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 19/02/24
 * Time : 4:13 pm
 * Project_Name : java_core
 */

public class r15 {
    public static void main(String[] args) {
        System.out.println("kth root find out : " + KthRoot(847, 3));
    }

    private static int KthRoot(int num, int p) {
        int beg = 1, end = num, ans = 0;
        while (beg < end) {
            int mid = beg + (end - beg) / 2;
            if (num >= (int) Math.pow(mid, p)) {
                beg = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;


    }

}