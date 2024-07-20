package com.java.codeAssignment.ThirdAssignment;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.util.Scanner;

public class q21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; ++i) {
            System.out.println();
            BinaryEquivalent(sc.nextInt());
        }

    }

    private static void BinaryEquivalent(int n) {
        int Decimal = 0;

        for (int p = 0; n != 0; n /= 10) {
            Decimal += n % 10 * (int) Math.pow(2, p);
            ++p;
        }

        System.out.print(Decimal);
    }
}

