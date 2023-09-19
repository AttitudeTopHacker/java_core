package com.java.pratice;
//string student calss pass the cunstructor
record Student(int roll, String name, String village) {

    public String toString() {
        return roll + " " + name + " " + village;
    }

}

public class p14 {
    public static void main(String[] args) {
        Student s1 = new Student(34, "salman", "Bagnera");
        Student s2 = new Student(73, "Shakir", "banskhera");

        System.out.println(s1);
        System.out.println(s2);
    }
}
