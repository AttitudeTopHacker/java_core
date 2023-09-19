//java point Arraylist
//array list of using interface in Objects List
//using this ListIterator
//using this Iterator
//using this enumeration
package javaCollection;

import java.util.ArrayList;
import java.util.ListIterator;

public class j1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(16);
        ArrayList<Object> arrayList1 = new ArrayList<>();

        arrayList.add("salman");
        arrayList.add("kaleem");
        arrayList.add("khan");
        arrayList.add("alkab");
        arrayList.set(1, "mohd");
        arrayList1.add(arrayList);
        System.out.println(arrayList1);
        for (Object o : arrayList1) {
            System.out.println(o);
        }
        ListIterator<String> arr = arrayList.listIterator();

        try {
            while (arr.hasNext()) {
                String str = arr.next();
                if (str.equals("alkab")) {
                    arr.set("Mohd alkab");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(arrayList);
    }
}
