package com.java.codeAssignment.SecondAssignment;


//
//Given a integer as a input and replace all the '0' with '5' in the integer
//Input Format
//
//Enter an integer n
//Constraints
//
//0<=n<=1000000000000
//Output Format
//
//All zeroes are replaced with 5
//Sample Input
//
//102
//
//Sample Output
//
//152
//
//Explanation
//
//Check each digit , if it is nonzero, then no change required but if it is zero then replace it by 5.


import java.util.Scanner;

public class q12 {
    public static void main(String[] args) {
        String n = (new Scanner(System.in)).next();
        String ans = "";
        for (int i = 0; i < n.length(); i++) {
            char rem = n.charAt(i);
            if (rem == '0') {
                rem = '5';
            }
            ans = ans + rem;
        }
        System.out.println(Long.valueOf(ans));
    }
}
