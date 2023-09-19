package com.java.pratice;

import java.util.Arrays;

public class p13 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("salman");
        String stri = str.append(" ansari").toString();
        stri = stri + " young boy :-";
        System.out.println(str);
        System.out.println(stri);
        str.append(384);
        System.out.println(str);

    }
}
