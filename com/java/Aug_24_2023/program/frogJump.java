package com.java.Aug_24_2023.program;

/**
 * create by  mohd salman
 * Date : 12/10/23
 * Time : 9:07 am
 * Project_Name : java_core
 */

public class frogJump {
    public static void main(String[] args) {
        int[] h = new int[]{10, 30, 40, 20};
        System.out.println(bestcost(h, 0));
    }

    private static int bestcost(int[] h, int idx) {
        if (h.length - 1 == idx) {
            return 0;
        }
        int op1 = bestcost(h, idx + 1) + Math.abs(h[idx] - h[idx + 1]);
        if (h.length - 2 == idx) {
            return op1;
        }
        int op2 = bestcost(h, idx + 2) + Math.abs(h[idx] - h[idx + 2]);
        return Math.min(op2, op1);
    }

}

    