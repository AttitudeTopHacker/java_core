package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;


//
//
//Take N as input. Print the sum of its odd placed digits and sum of its even placed digits.
//        Input Format
//
//Constraints
//
//0 < N <= 1000000000
//Output Format
//
//Sample Input
//
//2635
//
//Sample Output
//
//11
//5
//
//Explanation
//
//5 is present at 1st position, 3 is present at 2nd position, 6 is present at 3rd position and 2 is present at 4th position.
//
//Sum of odd placed digits on first line. 5 and 6 are placed at odd position. Hence odd place sum is 5+6=11
//
//Sum of even placed digits on second line. 3 and 2 are placed at even position. Hence even place sum is 3+2=5
//




public class q1 {
    public static void main(String[] args) {
        int n = (new Scanner(System.in)).nextInt();
        int odd = 0, even = 0;
        int i =0;
        while (n != 0) {
            int num = n % 10;
            if (i % 2 == 1) {
                odd += num;
            } else {
                even += num;
            }
            n /= 10;
            i++;
        }
        System.out.println(even);
        System.out.println(odd);

    }

}
