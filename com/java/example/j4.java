package com.java.example;

public class j4 {
    public static int  Factorial(int num)
    {
        if(num<1) {
          return 1;
        }
      return num * Factorial(num - 1);

    }

    public static void main(String[] args) {
        System.out.println("Factorial :-"+Factorial(4));
    }
}
