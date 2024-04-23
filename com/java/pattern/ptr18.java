package com.java.pattern;

public class ptr18 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            int sp = 0;
            if (i < n / 2 + 1) {
                while (sp < (n / 2) - i) {
                    System.out.print("  ");
                    sp++;
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("* ");
                }
            } else {
                while (sp < i - (n / 2)) {
                    System.out.print("  ");
                    sp++;
                }
                for (int j = 0; j <n-((i*2)-n+1); j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

//                *
//              * * *
//            * * * * *
//          * * * * * * *
//            * * * * *
//              * * *
//                *