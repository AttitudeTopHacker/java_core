package com.company.javamap;


// Java Code to sort Map by key value


import java.lang.*;
import java.util.*;

import java.util.stream.Collectors;
class SortmapKey {

    // This map stores unsorted values
    static Map<String, Integer> map = new HashMap<>();

    // Function to sort map by Key
    public static void sortbykey()
    {
        HashMap<String, Integer> temp = map.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> i1, Map.Entry<String, Integer> i2) {
                        return i1.getKey().compareTo(
                                i2.getKey());
                    }
                })
                .collect(Collectors.<Map.Entry<String, Integer>, String, Integer, LinkedHashMap<String, Integer>>toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        // Display the HashMap which is naturally sorted
        for (Map.Entry<String, Integer> entry :
                temp.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = "
                    + entry.getValue());
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        // putting values in the Map
        map.put("Jayant", 80);
        map.put("Abhishek", 90);
        map.put("Anushka", 80);
        map.put("Amit", 75);
        map.put("Danish", 40);

        // Calling the function to sortbyKey
        sortbykey();
    }
}