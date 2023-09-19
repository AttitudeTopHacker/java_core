package com.java.pratice;

public class p12 {
    public static void main(String[] args) {
        StringBuilder str =new StringBuilder("salman");
        StringBuilder str1 =new StringBuilder("salman");
//        System.out.println(str==str1); only object match not data match
        String sty=str.toString();
        System.out.println(sty);
        str.append(" Ansari");

        System.out.println("append() to add a string :- "+str);

    }
}
