//Group of oBject the comparator using the custom sorting to linkedList ;
package javaCollection;

import java.util.*;

record Book(int id, String name, String author, int quantity) {
    @Override
    public int id() {
        return id;
    }
}

class MyComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if (o1.id() < o2.id()) {
            return -1;
        }else if(o1.id() == o2.id()){ return 0;}
        else {return 1;}
    }

//    public int compare(Book o1, Book o2) {
//        return Integer.compare(o1.id(), o2.id());
//    }

}

    public class j4 {

        public static void main(String[] args) {
            Collection<Book> linkedList = new LinkedList<>();
            Book b1 = new Book(134, "java", "james gosling", 5);
            Book b2 = new Book(343, "C++", "mohd salman", 9);
            Book b3 = new Book(35, "C++", "mohd salman", 9);
            linkedList.add(b1);
            linkedList.add(b2);
            linkedList.add(b3);
//            for (Book book : linkedList) {
//                System.out.println(book);
//            }
//
//            for (Object listcommo_element : linkedList) {
//                System.out.println(listcommo_element);
//               }

Set<Book>sort = new TreeSet<>(new MyComparator());
            Set<Book>sort1=new TreeSet<>((o1, o2) -> {
                if (o1.id()<o2.id()) {
                return -1;
                }else if (o1.id()==o2.id()){
                    return 0;
                }return 1;
            });
            sort1.addAll(linkedList);
            System.out.println(sort1);
            sort.add(b1);
            sort.add(b2);
            sort.add(b3);
            System.out.println(sort);
        }
    }
