package com.java.Aug_24_2023.program;

public class StringFilter {
    public static void main(String[] args) {
        String[] str = {"Praveen Kumar", "Yuvraj Singh", "Harbhajan Singh", "Gurjit Singh", "Virat Kohli", "Rohit Sharma", "Sandeep Singh", "Milkha Singh"};
        FilterMode(str);
    }

    private static void FilterMode(String[] str) {
        byte title = (byte) "Singh".length();
        for (String s : str) {
            if (s.substring((s.length() - title)).equals("Singh")){
                System.out.println(s);
            }

        }
    }
}
