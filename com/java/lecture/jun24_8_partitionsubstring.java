package com.java.lecture;

import com.java.Aug_24_2023.program.String_palindrome;

public class jun24_8_partitionsubstring {
    public static void main(String[] args) {
        String st = "nitin";
        partition(st, "");

    }

    private static void partition(String st, String ans) {
        if (st.isEmpty()) {
            System.out.println(ans);
            return;
        }
        for (int i = 1; i <= st.length(); i++) {
            String s= st.substring(0,i);
            if(ispal(s)){
                partition(st.substring(i),ans+s+"|");
            }
        }
    }

    private static boolean ispal(String s) {
          int i = 0, j = s.length() - 1;
          while (i < j) {
              if (s.charAt(i) != s.charAt(j)) {
                  return false;
              }
              i++;
              j--;
          }
          return true;
    }

}
