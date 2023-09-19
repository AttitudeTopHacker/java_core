                                                  //fibonacci function is not
package com.java.example;
import java.util.Scanner;


public class j1 {

    public static int Fibonacci(int num) {
//      rule number 1 :-
//       if (num <= 1)
//        {
//            return num;
//        }
//        return (Fibonacci(num - 1) + Fibonacci(num - 2));


//        rule number 2:-
        if (num == 1 || num == 2) {
            return 1;
        } else if (num == 0) {
            return 0;
        }
        return (Fibonacci(num - 1) + Fibonacci(num - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(Fibonacci(i));
        }
    }
}
