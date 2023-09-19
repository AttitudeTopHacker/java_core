package com.company.javaCollection;
//Sting collection interface of collections to sorting function

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class j5 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("salman");
        arrayList.add("mohd");
        arrayList.add("imran");
        arrayList.add("rehaan");
        arrayList.set(2, "the boy");
        Collections.sort(arrayList);
        for (Object e : arrayList) {
            System.out.println(e);
        }
    }
}
