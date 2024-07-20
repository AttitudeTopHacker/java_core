package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine();
        boolean[] visited = new boolean[n];
        int cnt = 0;
        for (int i = 1; i <= st.length(); i++) {
            for (int j = 0; j <= st.length()-i; j++) {
                String temp = st.substring(j, j+i);
                if (isCB(temp) && isVisitedORnot(j, j+i, visited)) {
                    for (int k = j; k < j+i; k++) {
                        visited[k] = true;
                    }
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }

    private static boolean isVisitedORnot(int i, int j, boolean[] visited) {
        for (int k = i; k < j; k++) {
            if (visited[k] == true) {
                return false;
            }
        }
        return true;
    }

    private static boolean isCB(String temp) {
        long num = Long.parseLong(temp);
        if (num == 1 || num == 0) {
            return false;
        }
        int[] cbNumber = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < cbNumber.length; i++) {
            if (num == cbNumber[i]) {
                return true;
            }
        }
        for (int i = 0; i < cbNumber.length; i++) {
            if (num % cbNumber[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
//        8
//        81
//        816
//        8161
//        81615
//        1
//        16
//        161
//        1615
//        6
//        61
//        615
//        1
//        15
//        5



//8
//        1
//        6
//        1
//        5
//        81
//        16
//        61
//        15
//        816
//        161
//        615
//        8161
//        1615
//        81615