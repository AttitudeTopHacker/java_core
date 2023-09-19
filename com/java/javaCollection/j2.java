package javaCollection;

import java.util.LinkedList;

public class j2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("salman");
        list.add("faizan");
        list.add("going that");
        list.add("faizan Ishaq");
        System.out.println(list);
        System.out.println( list.offer("the man of house"));
        System.out.println(list.add("going house"));
        for (String s : list) {
            System.out.println(s);

        }
        System.out.println(list);
    }
}
