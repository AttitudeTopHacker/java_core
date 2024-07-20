package com.java.codeAssignment.fourthAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prathe = sc.nextInt();
        int cook = sc.nextInt();
        int[] rank = new int[cook];
        for (int i = 0; i < rank.length; i++) {
            rank[i] = sc.nextInt();
        }
        Arrays.sort(rank);// rank is sort increase
        System.out.println(minimumTimeCalculate(rank, prathe));

    }

    public static int minimumTimeCalculate(int[] rank, int prathe) {

        int lo = 0;
        int hi = (rank[rank.length - 1] * (prathe * (prathe + 1))) / 2;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            //which make the pratha
            if (isitpossible(rank, mid, prathe)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;

    }

    public static boolean isitpossible(int[] rank, int mid, int prathe) {
        int paratha = 1;
        int totaltime = 0;
        int taoatlparatha = 0;
        int i = 0;
        while (i < rank.length) {
            if (totaltime + paratha * rank[i] <= mid) {
                totaltime = totaltime + paratha * rank[i];
                paratha++;
                taoatlparatha++;
            } else {
                i++;
                paratha = 1;
                totaltime = 0;
            }
            if (taoatlparatha == prathe) {
                return true;
            }
        }
        return false;
    }
}

