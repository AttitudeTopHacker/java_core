package com.java.pratice;
//String titel match filter on the program in java

import java.util.stream.IntStream;

//for each order for each arrays.stream wala
public class p20 {
    public static void fillterMode(String[] str) {
        String title = "singh";
        int titleLenght = title.length();
        IntStream.range(0, str.length).forEach(i -> {
            int nameLenght = str[i].length();
            String substr = str[i].substring(nameLenght - titleLenght);
            if (title.equalsIgnoreCase(substr)) {
                System.out.println(str[i]);
            }
        });

    }

    public static void main(String[] args) {
        String[] str = {"Praveen Kumar", "Yuvraj Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli", "Rohit Sharma", "Sandeep Singh", "Milkha Singh"};
        fillterMode(str);
    }
}
