package com.java.codeAssignment.fourthAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int painters = sc.nextInt(); //painters
        int N = sc.nextInt(); // NUMBER OF BOARD
        int[] board = new int[N];
        for (int i = 0; i < N; i++) {
            board[i] = sc.nextInt();
        }
//        Arrays.sort(board);
        int lo = 0;
        int hi = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            hi += board[i];
        }
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (itispossible(mid, board, painters)) {
                hi = mid - 1;
                ans = mid;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(ans);
    }

    private static boolean itispossible(int mid, int[] board, int painters) {
        int p = 1;
        int totalBoard = 0;
        for (int i = 0; i < board.length; ) {
            if (mid >= totalBoard + board[i]) {
                totalBoard += board[i];
                i++;
            }else {
                p++;
                totalBoard = 0;
            }
            if(p > painters) {
                return false;
            }
        }
        return true;
    }
}
