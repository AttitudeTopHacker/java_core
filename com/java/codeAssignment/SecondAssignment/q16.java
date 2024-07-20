package com.java.codeAssignment.SecondAssignment;

import java.util.Scanner;

public class q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sb = sc.nextInt();
        long db = sc.nextInt();
        long n = sc.nextLong();
        long binary = 2, octal = 8, decimal = 10;
        if (decimal == sb && db == binary) {//Decimal to binary
            System.out.println(DecimalToBinaryOctal(n, db));
        } else if (decimal == sb && db == octal) {  //Decimal To Octal;
            System.out.println(DecimalToBinaryOctal(n, db));
        } else if (binary == sb && db == decimal) {
            System.out.println(BinaryToDecimal(n));
        } else if (binary == sb && db == octal) {
            System.out.println(BinaryToOctal(n, db));
        } else if (octal == sb && db == decimal) {
            System.out.println(OctalToDecimal(n));
        } else if (octal == sb && db == binary) {
            System.out.println(OctalToBinary(n, db));
        } else if (16 == sb && db == decimal) {
            System.out.println(HexaDecimalToDecimal(n));
        } else if (16 == sb && db == binary) {
            long Decimal = HexaDecimalToDecimal(n);
            System.out.println(DecimalToBinaryOctal(Decimal, 2));
        } else if (16 == sb && db == octal) {
            long Decimal = HexaDecimalToDecimal(n);
            System.out.println(DecimalToBinaryOctal(Decimal, db));
        }
    }

    private static long HexaDecimalToDecimal(long n) {
        long Hexa = 0, p = 0;
        while (n != 0) {
            Hexa = Hexa + (n % 10) * (long) Math.pow(16, p);
            n /= 10;
            p++;
        }
        return Hexa;
    }

    private static String OctalToBinary(long n, long db) {
        long decimal = OctalToDecimal(n);
        return DecimalToBinaryOctal(decimal, db);
    }

    private static String DecimalToBinaryOctal(long n, long db) {
        String ans = "";
        while (n != 0) {
            ans = (n % db) + ans;
            n /= db;
        }
        return ans;
    }

    private static long OctalToDecimal(long n) {
        long decimal = 0, p = 0;
        while (n != 0) {
            decimal = decimal + (n % 10) * (long) Math.pow(8, p);
            n /= 10;
            p++;
        }
        return decimal;
    }

    private static String BinaryToOctal(long n, long db) {
        long decimal = BinaryToDecimal(n);
        return DecimalToBinaryOctal(decimal, db);
    }
    private static long BinaryToDecimal(long n) {
        long decimal = 0;
        long p = 1;
        while (n != 0) {
            if (n % 10 == 1) {
                decimal += p;
            }
            p *= 2;
            n /= 10;
        }
        return decimal;
    }
}
