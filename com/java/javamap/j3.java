package com.company.javamap;
import java.util.LinkedHashMap;
import java.util.Map;

record Book (int id, String name, String author, String publisher, int quantity) {

}
public class j3 {
    public static void main(String[] args) {
        Map<Integer,Book>map=new LinkedHashMap<>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        map.put(2,b2);
        map.put(1,b1);
        map.put(3,b3);
        for (Map.Entry<Integer,Book>entry:map.entrySet()){
            int key=entry.getKey();
            Book b=entry.getValue();
            System.out.println("key="+key+" value="+b.author()+","+b.id()+","+b.name()+","+b.publisher()+""+b.quantity());
        }
    }
}
