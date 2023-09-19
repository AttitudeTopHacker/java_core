package com.java.pratice;

public class p7 {

    // main method
    public static void main(String argvs[]) {

// the string contains white spaces
// therefore, trimming the spaces leads to the
// generation of new string
        String str = " abc ";

// str1 stores a new stringchoec
        String str1 = str.trim();
        String hig = new String(" abc ");
// the hashcode of str and str1 is different
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode() + "\n");

// no white space present in the string s
// therefore, the reference of the s is returned
// when the trim() method is invoked
        String s = "  xyz ";
        s = s.trim();
        String t;
        t = hig.trim().intern();
        String s3 = s;
// the hashcode of s and s1 is the same
        System.out.println(hig.hashCode());
        System.out.println(t.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s3.hashCode());

    }
}

