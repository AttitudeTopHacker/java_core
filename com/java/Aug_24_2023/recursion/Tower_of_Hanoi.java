package com.java.Aug_24_2023.recursion;

import java.util.Scanner;

class Tower_of_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of Hanoi :-");
        int num = sc.nextInt();
        ToH(num, "s", "d", "Aux");

    }

    private static void ToH(int num, String s, String d, String aux) {
        if (num == 1) {
            System.out.println(num + " Disk from " + s + " to " + d);
            return;
        }
        ToH(num - 1, s, aux, d);
        System.out.println(num + " from " + s + " to " + d);
        ToH(num - 1, aux, s, d);
    }
}
