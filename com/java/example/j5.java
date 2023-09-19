package com.java.example;
//ArmStrong number is or not ;
import java.util.Scanner;

public class j5 {
    public static boolean armStrong(int num) {
        int digit, arm = 0 ,copy=num;
        while (copy!=0)
        {
            digit= copy%10;
            arm= arm+(digit*digit*digit);
            copy = copy/10;
        }
        return arm==num;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int arm = sc.nextInt();
        if (armStrong(arm))
        {
            System.out.println("is armStrong number :-");

        }else
            System.out.println("is not armStrong number :-");
    }
}
