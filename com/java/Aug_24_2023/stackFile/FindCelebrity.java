package com.java.Aug_24_2023.stackFile;


import java.util.Stack;

/**
 * create by  mohd salman
 * Date : 28/10/23
 * Time : 5:30 pm
 * Project_Name : java_core
 */

public class FindCelebrity {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[][] MATRIX = {{0, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};
        for (int i = 0; i < MATRIX.length; i++) {
            stack.push(i);
        }
        while (stack.size() > 1) {
            int v1 = stack.pop();
            int v2 = stack.pop();
            if (MATRIX[v1][v2] == 0) {
                stack.push(v1);
            } else if (MATRIX[v2][v1] == 0) {
                stack.push(v2);
            }
        }
        if (stack.isEmpty()) {
            return;
        }
        int potential = stack.pop();
        for (int i = 0; i < MATRIX[potential].length; i++) {
            if (i == potential) {
                continue;
            }
            if (MATRIX[potential][i] == 1 || MATRIX[i][potential] == 0) {
                return;
            }
        }
        System.out.println("Is celebrity :- "+potential);

    }

}

    