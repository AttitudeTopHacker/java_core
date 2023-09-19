package javaCollection;
//don't usings the interface add the list to the hash set sorting not allwod
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class j7 {
    public static void main(String[] args) {
ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        HashSet<String> set1 = new HashSet<>(list);
        set1.add("Gaurav");
        list.clear();
        list.addAll(set1);
        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

//        System.out.println((list));
    }
}

