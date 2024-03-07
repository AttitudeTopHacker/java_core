package com.java.Aug_24_2023.Map;

import java.util.HashMap;
import java.util.HashSet;

/**
 * create by  mohd salman
 * Date : 19/11/23
 * Time : 12:02 am
 * Project_Name : java_core
 */

public class IsoMorphic {
    public static void main(String[] args) {
        HashMap<Character, Character> map = new HashMap<>();

        String S1 = "aabcbc";
        String S2 = "xxywyw";
//        for (int i = 0; i < S1.length(); i++) {
//            Character S1Ch = S1.charAt(i);
//            Character S2Ch = S2.charAt(i);
//            if (map.containsKey(S1Ch)) {
//                if (map.get(S1Ch) != S2Ch) {
//                    System.out.println("is not IsoMorphic");
//                    return;
//                }
//            } else if (map.containsValue(S2Ch)) {
//                System.out.println("is not IsoMorphic");
//                return;
//            } else {
//                map.put(S1Ch, S2Ch);
//            }
//        }
//        System.out.println("is Isomorphic");
        IsoMorphics(S1, S2);

    }

    private static void IsoMorphics(String s1, String s2) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> has = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            Character ky = s1.charAt(i);
            Character val = s2.charAt(i);
            if (map.containsKey(ky)) {
                if (map.get(ky) != val) {
                    System.out.println("is not isomorphic :-");
                    return;
                }
            } else if (has.contains(val)) {
                System.out.println("is not isomorphic :-");
                return;
            }else {
                map.put(ky,val);
                has.add(val);
            }

        }
        System.out.println("is isomorphic :-");
    }
}

    