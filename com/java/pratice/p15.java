package com.java.pratice;

import java.util.StringTokenizer;

public class p15 {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("the main function in the party house");
        StringTokenizer str1 = new StringTokenizer("the,main,function In,the,party,house"," ");
        while (str1.hasMoreElements()) {
            System.out.println(str1.nextElement());
        }
    }
}
