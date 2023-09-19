package com.company.javamap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

class j1 {
    public static void main(String[] args) {
        HashMap<Integer, String> keys = new HashMap<>();
        keys.put(23, "Yash");
        keys.put(17, "Arun");
        keys.put(15, "Swarit");
        keys.put(9, "Neelesh");
        TreeMap<Integer, String> sorts = new TreeMap<>(keys);
//        for (Map.Entry<String, Integer> it : sorts.entrySet()) {
//            System.out.println(it.getKey());
//        }
        Iterator<Integer> ie = sorts.keySet().iterator();
//        while (ie.hasNext()) {
//            int key = ie.next();
//            System.out.println(key + "" + sorts.get(key));
//        }
        for (int key : sorts.keySet()) {
            System.out.println(key);
        }
    }
}
