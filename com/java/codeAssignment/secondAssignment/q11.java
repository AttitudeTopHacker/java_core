package com.java.codeAssignment.secondAssignment;


import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

//        long n = scn.nextLong();
//
//        long[] arr = new long[18];
//
//        int count = 0;
//
//        while (n != 0) {
//            long rem = n % 10;
//            arr[count] = rem;
//            count++;
//            n = n / 10;
//        }
//
//        // count will tell total no. of digits
//
//        for (int i = 0; i < count; i++) {
//
//            if (i != count - 1) {
//                if (arr[i] >= 5) {
//                    arr[i] = 9 - arr[i];
//                }
//            } else {
//                if (arr[i] >= 5 && arr[i] <= 8) {
//                    arr[i] = 9 - arr[i];
//                }
//            }
//        }
//
//        for (int i = count - 1; i >= 0; i--) {
//            System.out.print(arr[i]);
//        }
//
//    }

        String str = scn.next();
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '9' && i == 0) {
                answer += ch;
                continue;
            }
            if (ch < '5') {
                answer += ch;
            } else {
                answer += '9' - ch;
            }
        }
        System.out.println(answer);

    }
}
