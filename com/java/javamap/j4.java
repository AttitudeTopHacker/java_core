package com.javamap;

import java.util.*;

public class j4 {
 public static HashMap Sorted(HashMap hm)
    {

return hm;
    }


    public static void main(String[] args) {
//implementing HashMap
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(6, "Tushar");
        hm.put(12, "Ashu");
        hm.put(5, "Zoya");
        hm.put(78, "Yash");
        hm.put(10, "Praveen");
        hm.put(67, "Boby");
        hm.put(1, "Ritesh");
        System.out.println("Before Sorting:");
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry map = (Map.Entry) iterator.next();
            System.out.println("Roll no:  " + map.getKey() + "     Name:   " + map.getValue());
        }
        Map<Integer,String>sort=Sorted(hm);


        Map<Integer, String> map = sortValues(hm);
        System.out.println("\n");
        System.out.println("After Sorting:");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator2.next();
            System.out.println("Roll no:  " + me2.getKey() + "     Name:   " + me2.getValue());
        }
    }

    //method to sort values
    private static HashMap sortValues(HashMap map) {
        List list = new LinkedList(map.entrySet());
        Collections.sort(list,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable)((Map.Entry)o1).getKey()).compareTo(((Map.Entry)o2).getKey());

            }
        });
        HashMap linkHasMap = new LinkedHashMap<>();

        for (Iterator iterator= list.iterator(); iterator.hasNext(); ) {
            Map.Entry entry1 = (Map.Entry) iterator.next();
          linkHasMap.put((Integer) entry1.getKey(), (String) entry1.getValue());
        }

        return (HashMap) linkHasMap;


    }

}


