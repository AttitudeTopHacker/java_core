package com.java.Aug_24_2023;

/**
 * create by  mohd salman
 * Date : 15/10/23
 * Time : 11:10 am
 * Project_Name : java_core
 */

public class SubstringPrint {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String s = "Hellobye";
//		System.out.println(s.substring(2, 5));
//		System.out.println(s.substring(5, 8));
//		System.out.println(s.substring(2));
        PrintSubString(s);

    }

    public static void PrintSubString(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length()+1; j++) {
//                System.out.println(s.substring(i, j));
//            }
//        }

        //length wise print substring ;
        for (int len = 1; len <= s.length(); len++) {
            for (int j = len; j <= s.length(); j++) {

                System.out.println(s.substring(j-len, j));

            }

        }
    }

}

    