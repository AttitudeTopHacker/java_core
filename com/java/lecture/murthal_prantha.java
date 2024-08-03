package com.java.lecture;

import java.util.Scanner;

public class murthal_prantha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prantha = sc.nextInt();
        int cokes = sc.nextInt();
        int[] ranks = new int[cokes];
        for (int i = 0; i < cokes; i++) {
            ranks[i] = sc.nextInt();
        }
        System.out.println(minimumTime(ranks, prantha));


    }

    private static int minimumTime(int[] ranks, int prantha) {
        int answer = 0;
        int low = 0;
        int high = (ranks[ranks.length - 1] * prantha * (prantha + 1)) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (itsmakeprathapossible(mid, ranks, prantha)) {
                high = mid - 1;
                answer = mid;
            } else {
                low = mid + 1;
            }
        }

        return answer;
    }

    private static boolean itsmakeprathapossible(int mid, int[] rank, int prathe) {
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
