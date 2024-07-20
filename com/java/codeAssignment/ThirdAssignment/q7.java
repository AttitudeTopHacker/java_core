package com.java.codeAssignment.ThirdAssignment;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1, c2, c3, c4, n, m;
        int T = sc.nextInt();
        while (T-- > 0) {
            c1 = sc.nextInt();
            c2 = sc.nextInt();
            c3 = sc.nextInt();
            c4 = sc.nextInt();
            n = sc.nextInt();
            m = sc.nextInt();
            int[] rick = new int[n];
            int[] cab = new int[m];
            for (int i = 0; i < n; i++) {
                rick[i]= sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                cab[i]= sc.nextInt();
            }

            int rickcost = 0;
            for (int i = 0; i < n; i++) {
                rickcost += Math.min(c1 * rick[i], c2);
            }
            rickcost = Math.min(rickcost, c3);

            int cabcost = 0;
            for (int i = 0; i < m; i++) {
                cabcost += Math.min(c1 * cab[i], c2);
            }
            cabcost = Math.min(cabcost, c3);

            System.out.println(Math.min(c4, rickcost + cabcost));

        }
    }
}
