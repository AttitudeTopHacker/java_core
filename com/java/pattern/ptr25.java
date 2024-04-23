package com.java.pattern;

public class ptr25 {
    public static void main(String[] args) {
        int n = 5, scn, count = 0;
        for (int i = 0; i < n; i++) {
            scn = i;
            while (scn < n - 1) {
                System.out.print("   ");
                scn++;
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if(count>=9 ){
                    System.out.print(count + 1 + " ");

                }else {
                    System.out.print(count + 1 + "  ");

                }
                count++;
            }
            System.out.println();

        }
    }
}
