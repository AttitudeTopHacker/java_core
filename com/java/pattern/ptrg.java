package com.java.pattern;

public class ptrg {
    public static void main(String[] args) {
        int k = 5;
        int n = k * 2 + 1;//11
        for (int i = 1; i <= n; i++) {
            int st = 0;
            int sp = 0;
            int count = n / 2;  /*5*/
            if (i <= n / 2 + 1) {
                for (int j = 1; j < n; j++) {
                    while (j <= i) {
                        if (j == n / 2 + 1) {
                            j++;
                            count--;
                        } else {
                            System.out.print(count-- + "  ");
                        }
                        j++;

                    }
                    while (sp < (n + 1) - ((1 + i) * 2 - 1)) {
                        System.out.print("   ");
                        sp++;
                        j++;
                    }
                    while (st < i) {
                        System.out.print(++count + "  ");
                        j++;
                        st++;
                    }
                }
            } else {
                count = n / 2;
                for (int j = 0; j < n; j++) {
                    st = 0;
                    while (st < (n + 1) - i) {
                        System.out.print(count-- + "  ");
                        st++;
                        j++;
                    }
                    sp = 0;
                    count++;
                    while (sp < count * 2 - 1) {
                        System.out.print("   ");
                        sp++;
                        j++;
                    }
                    st = 0;
                    while (st < (n + 1) - i) {
                        System.out.print(count++ + "  ");
                        j++;
                        st++;
                    }
                }
            }
            System.out.println();
        }
    }
}
