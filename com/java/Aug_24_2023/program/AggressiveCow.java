package com.java.Aug_24_2023.program;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 13/10/23
 * Time : 12:53 pm
 * Project_Name : java_core
 */

public class AggressiveCow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cow = sc.nextInt();
        int []stall = new int[N];
        for (int i = 0; i < N; i++) {
            stall[i] = sc.nextInt();
        }
        int lo = stall[0];
        int hi = stall[stall.length - 1];
        int ans = -1;
        Arrays.sort(stall);
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
        System.out.println(c);

        return c == cow;
    }

}