package com.java.pratice;

import java.util.Scanner;
//String palindrome or not check wheather
record StringPalindrome(String name) {


    void display()
    {
        System.out.println(name);
}
    public boolean IsPalindrome(String name) {
        int length = name.length();
        if (length == 0 || length == 1) {
            return true;
        }
        String l = name.substring(0, 1);

        String r = name.substring(length - 1);
        if (l.equals(r)) {
            return IsPalindrome(name.substring(1, length -1));
        }
        return false;
    }

}

public class p19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringPalindrome palindrome = new StringPalindrome("enter the String palindrome or not :-");
        palindrome.display();
        String str = sc.nextLine();
        if (palindrome.IsPalindrome(str))
            System.out.println("Is Plindrome :-");
        else
            System.out.println(" is not palindrome :-");

    }
}
