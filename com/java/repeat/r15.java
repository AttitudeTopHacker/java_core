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
            int mid = (end - beg) / 2 + beg;
            if (Math.pow(mid, p) <= num) {
                ans = mid;
                beg = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;


    }

}