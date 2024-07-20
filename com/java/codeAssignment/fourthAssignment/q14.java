package com.java.codeAssignment.fourthAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int NumOfCow = sc.nextInt();
        int[] stall = new int[N];
        for (int i = 0; i < N; i++) {
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall);
        int lo = stall[0];
        int hi = stall[N - 1];
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (ItsPossibleSit(stall, mid, NumOfCow)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean ItsPossibleSit(int[] stall, int mid, int numOfCow) {
        int st = stall[0];
        int cow = 1;
        int i = 1;
        while (i < stall.length) {
            if (stall[i] - st >= mid) {
                cow++;
                st = stall[i];
            }
            i++;
            if (cow == numOfCow) {
                return true;
            }
        }
        return false;
    }
}
