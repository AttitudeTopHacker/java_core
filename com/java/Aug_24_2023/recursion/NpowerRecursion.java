package com.java.Aug_24_2023.recursion;

import com.java.Aug_24_2023.linkedlist.linkedList_intersection;

/**
 * create by  mohd salman
 * Date : 26/09/23
 * Time : 10:09 pm
 * Project_Name : java_core
 */

public class NpowerRecursion {
    public static void main(String[] args) {
        int n = 2, p = 3;
        System.out.println(NPower(n, p));

    }

    private static int NPower(int n, int p) {
        if (p == 1) {
            return n;
        }
        if (p % 2 == 0) return n * NPower(n, p / 2);
        return n * n * NPower(n,p/2);
    }
}

    