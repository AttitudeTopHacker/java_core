package com.java.pattern;
public class ptrf {
    public static void main(String[] arg) {
        int n = 7;
//        int n = (new Scanner(System.in)).nextInt();
        for (int i = 1; i <= n; i++) {
            int count = i;
            int sp = 0;
            int st = 0;
//             1 step n-(i*2-1)  6 4 2 0
            if (i <= n / 2 + 1) {
                while (sp < n - (i * 2 - 1)) {
                    System.out.print("  ");
                    sp++;
                }
//            2 step st< i  1, 2, 3 ,4
                while (st < i) {
                    System.out.print(count-- + " ");
                    st++;
                }
                sp = 0;
//            3 step(i - 1) * 2 - 1  0, 1 3,4,;
                while (sp < ((i - 1) * 2) - 1) {
                    System.out.print("  ");
                    sp++;
                }

//            4 step  st<i 0<1  0 to 1,2,3,4,
                count++;
                st = 0;
//                step
                while (st < i) {
                    if (i != 1) {
                        System.out.print(count++ + " ");
                    }
                    st++;
                }
            } else {
                int down = (n - i) + 1;

                while (sp < i - down) {
                    System.out.print("  ");
                    sp++;
                }
                count = down;
                while (st < down) {
                    System.out.print(count-- + " ");
                    st++;
                }
                count++;
                sp = 0;
//               i = 5,6,7  n-((i*2)-n)-1 = 3 2 1
                while (sp < n - ((i * 2) - n) - 1) {
                    System.out.print("  ");
                    sp++;
                }
                st = 0;
                while (st < down) {
                    if (i != n) {
                        System.out.print(count++ + " ");
                    }
                    st++;
                }
            }

            System.out.println();


        }


    }
}


//                 1
//             2 1   1 2
//         3 2 1       1 2 3
//     4 3 2 1           1 2 3 4
//         3 2 1       1 2 3
//             2 1   1 2
//                 1
