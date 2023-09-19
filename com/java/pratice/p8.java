package com.java.pratice;

//join method in java and intern
public class p8 {
    public static void main(String[] args) {
        String str = String.join("/", "34", "er", "2");
        System.out.println(str);

        //orignal string
        String str1 = "salman";
        String str2 = "salman";
        System.out.println(str2.equals(str1));

        // constructor in java string
        String t = new String("salman");
        String t1 = new String("salman");
//        false 
        System.out.println(t1.equals(t));
//        true
        System.out.println(t1.intern().equals(t.intern()));
    }
}