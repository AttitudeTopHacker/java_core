package com.java.Aug_24_2023.program;

import java.util.Arrays;

/**
 * create by  mohd salman
 * Date : 15/10/23
 * Time : 6:09 pm
 * Project_Name : java_core
 */

public class Freq_Array {
    public static void main(String[] args) {
        String s = "dsfghjkfdaafsdhgfasdewrtyuioipsdfghjklzxcvbnm";
        int[] frq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frq[ch - 'a']++;
//            frq[ch - 'a'] = frq[ch - 'a'] + 1;
        }
        System.out.println(Arrays.toString(frq));

    }

}

    