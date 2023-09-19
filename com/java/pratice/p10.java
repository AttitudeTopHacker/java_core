package com.java.pratice;

public class p10 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer();
        int a = str.capacity();
        str.append("dfskjdahfk");
        str.ensureCapacity(13);
        str.append("lkdfjldfkjklgj");
        System.out.println(a);
        System.out.println(str.capacity());
    }
}
