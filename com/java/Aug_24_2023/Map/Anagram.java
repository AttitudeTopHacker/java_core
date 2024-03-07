package com.java.Aug_24_2023.Map;

import java.util.HashMap;

/**
 * create by  mohd salman
 * Date : 16/11/23
 * Time : 5:18 pm
 * Project_Name : java_core
 */

public class Anagram {
    public static void main(String[] args) {
        String s1 = "salman";
        String s2 = "nalsam";
        if (IsAnagram(s1, s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        HashMap<Integer, String> m = new HashMap<>();

    }

    private static boolean IsAnagram(String s1, String s2) {
        HashMap<Character, Integer> m1;
        HashMap<Character, Integer> m2;
        m1 = GenerateKey(s1);
        m2 = GenerateKey(s2);

        Character ch;
        System.out.println(m1);
        for (int i = 0; i < s2.length(); i++) {
            ch = s2.charAt(i);
            if (m1.containsKey(ch)) {
                m1.put(ch, m1.get(ch) - 1);
                if (m1.get(ch) == 0) {
                    m1.remove(ch);
                }
            } else {
                System.out.println("false");
            }

        }
        System.out.println(m1.isEmpty());
        return m1.equals(m2);
    }

    private static HashMap<Character, Integer> GenerateKey(String s1) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        return map;
    }

}

    