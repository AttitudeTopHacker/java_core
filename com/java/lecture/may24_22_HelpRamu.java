package com.java.lecture;

import java.util.Scanner;

public class may24_22_HelpRamu {
    public static void main(String[] args) {
        int c1, c2, c3, c4, rn, cm;
        Scanner sc = new Scanner(System.in);
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        c3 = sc.nextInt();
        c4 = sc.nextInt();
        rn = sc.nextInt();
        cm = sc.nextInt();
        int []rickshaw = new int[rn];
        int []cab= new int[cm];
        for (int i = 0; i < rn; i++) {
            rickshaw[i] = sc.nextInt();
        }
        for (int i = 0; i < cm; i++) {
            cab[i] = sc.nextInt();
        }
        System.out.println(Math.min((minicostRickshawAndCab(rickshaw,c1,c2,c3,c4,rn) +minicostRickshawAndCab(cab,c1,c2,c3,c4,cm)),c4));

    }

    private static int minicostRickshawAndCab(int[] RickshawAndCab, int c1, int c2, int c3, int c4, int rnAndCm) {
        int sum=0;
        for (int i = 0; i < RickshawAndCab.length; i++) {
         sum+= Math.min(c2, c1*RickshawAndCab[i]);
        }
        return Math.min(sum ,c3);

    }
}
