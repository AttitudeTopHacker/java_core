package com.java.assignment;

import java.util.Scanner;

/**
 * create by  mohd salman
 * Date : 19/09/23
 * Time : 6:48 am
 * Project_Name : java_core
 */

public class watermillon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
       if(w>2) {
           if (w % 2 == 0) {
               System.out.println("YES");
           }
       }else {
           System.out.println("NO");
       }
    }
}

    