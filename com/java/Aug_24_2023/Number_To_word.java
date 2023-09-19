package com.java.Aug_24_2023;

public class Number_To_word {
    public static void main(String[] args) {

        System.out.println(digitT0Word(0));
    }

    private static String digitT0Word(int n) {
        String[] unary = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] two_nary = {"", "", "twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        if (0 >= n)
            return "Zero";
        if (n < 20) {
            return unary[n];
        } else if (n < 100) {
            return two_nary[n / 10] + " " + digitT0Word(n % 10);
        } else if (n < 1000) {
            return unary[n / 100] + " Hundred " + digitT0Word(n % 100);
        } else if (n < 100000) {
            return digitT0Word(n / 1000) + " Thousand " + digitT0Word(n % 1000);
        } else if (n < 10000000) {
            return digitT0Word(n / 100000) + " lakh " + digitT0Word(n % 100000);
        }
        return "Zero";
    }
}
