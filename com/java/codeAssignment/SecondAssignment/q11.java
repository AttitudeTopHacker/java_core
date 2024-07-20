package com.java.codeAssignment.SecondAssignment;


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
//     46343

//     first digit pick  kar ke check kare ki  0 to 4 me align karti hai not invert
//     5 to 9 ke beech align karti hai to 9 - (subtract) this pick number (9-t)
//     any number pick kiya hua number invert karne per pick kiye hue number se bada bada hai to no invert
//     96343
//        invert (9-t)
//        0to4 no invert because
//
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
