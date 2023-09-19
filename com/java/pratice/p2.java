package com.java.pratice;

//object clone ;
/*class student {
    private final String name;
    private final int roll;

    public student(int roll, String name) {
        this.name = name;
        this.roll = roll;
    }

    public void showdata() {
        System.out.println("Name ="+name+"\nroll ="+roll);
    }
}*/

    record student(int roll, String name) implements Cloneable {

    public void showdata() {
        System.out.println("roll=" + roll + "  name=" + name);
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
public class p2 {
    public static void main(String[] args) {
        student s1 = new student(543, "amit");
        s1.showdata();
        try{
        student s2 = (student) s1.clone();
            s2.showdata();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

