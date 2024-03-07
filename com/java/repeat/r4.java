package com.java.repeat;

/**
 * create by  mohd salman
 * Date : 05/02/24
 * Time : 12:08 pm
 * Project_Name : java_core
 */

public class r4 {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 3, 4,5, 6, 11, 15, 23, 32};
        int lo = 0, high = ar.length , search = 32;

        int mid = (lo + high) / 2;
        while (lo < high) {
            if (ar[mid] == search) {
                System.out.println("element found out the  arr : " + search);
                break;
            } else if (ar[mid] < search) {
                lo = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (lo + high) / 2;
        }
        if (lo == high) {
            System.out.println("not find element :");
        }
    }

}

    