package com.java.Aug_24_2023.program;

import java.util.Arrays;
import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 15/10/23
 * Time : 5:53 pm
 * Project_Name : java_core
 */

public class finding_cb_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        Substring(str);

        int a = 9;
        Integer a1 = 91;
        System.out.println(a);
        System.out.println(a1);
        // auto-boxing
        a1 = a;
        int b = 11;
        Integer b1 = 189;
        // un-boxing
        b = b1;

        Integer c1 = 18;
        Integer c2 = 18;
        Integer c3 = 189;
        Integer c4 = 189;
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);
    }

    public static void Substring(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];
        for (int len = 1; len <= str.length(); len++) {
            for (int j = len; j <= str.length(); j++) {
                int i = j - len;
                String s = str.substring(i, j);// string number
                if (IscbNumber(Long.parseLong(s)) == true && Isvisited(visited, i, j - 1) == true) {
                    count++;
                    System.out.println(s);
                    for (int k = i; k < j; k++) {
                        visited[k] = true;// marked
                    }
                }

            }

        }
        System.out.println(count);

    }

    public static boolean Isvisited(boolean[] visited, int i, int j) {
        // TODO Auto-generated method stub
        for (int k = i; k <= j; k++) {
            if (visited[k] == true) {
                return false;
            }
        }
        return true;
    }

    public static boolean IscbNumber(long num) {
        if (num == 0 || num == 1) {
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (num % arr[i] == 0) {
                return false;
            }
        }
        return true;

    }

}

    