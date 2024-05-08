package com.java.codeAssignment.secondAssignment;


//Take the following as input.
//
//Minimum Fahrenheit value
//Maximum Fahrenheit value
//        Step
//
//Print as output the Celsius conversions. Use the formula C = (5/9)(F – 32) E.g. for an input of 0, 100 and 20 the output is
//0 -17
//        20 -6
//        40 4
//        60 15
//        80 26
//        100 37
//Input Format
//
//The first line of the input contains an integer denoting the Minimum Fahrenheit value. The second line of the input contains an integer denoting the Maximum Fahrenheit value. The third line of the input contains an integer denoting the Step.
//Constraints
//
//0 < Min < 100
//Min < Max < 500
//        0 < Step<150
//Output Format
//
//Print Fahrenheit and Celsius values separated by a tab. Each step should be printed in a new line.
//        Sample Input
//
//0
//        100
//        20
//
//Sample Output
//
//0 -17
//        20 -6
//        40 4
//        60 15
//        80 26
//        100 37
//
//Explanation
//
//First number in every output line is fahrenheit, second number is celsius. The two numbers are separated by a tab.


import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int p = sc.nextInt();
        fahrenheit(s, e, p);


    }

    private static void fahrenheit(int s, int e, int p) {
        int step = 0;
        while (s <= e) {
            System.out.println(step + " " + (int) (5.0 / 9.0 * (s - 32)));
            s = s + p;
            step = step + p;
        }
    }
}


