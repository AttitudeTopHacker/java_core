package javaCollection;
//using vector class of list Interface sorting
import java.util.*;

public class j6 {
    public static void main(String[] args) {
List<Integer> linked = new Vector<>();
        linked.add(51);
        linked.add(54);
        linked.add(10);
        linked.add(54);
        linked.add(45);
        linked.add(34);
        Collections.sort(linked);
        for (Object element:linked
             ) {System.out.println(element);
        }

    }
}
