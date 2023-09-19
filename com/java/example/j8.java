package com.java.example;

class Employee {
    private int roll;
    private String name;

    @Override

    public boolean equals(Object ob) {
        if (ob == null) {
            return false;

        } else if (this == ob) {
            return true;
        }
//        return false;
        return (this.getRoll() == ((Employee) ob).getRoll());
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int roll, String name) {
        this.name = name;
        this.roll = roll;
    }
}

public class j8 {

    public static void main(String[] args) {
//      method 1 ;************************************************************************************
//        Long y = new Long(123);
//        Long x = new Long(123);
//        Double b= new Double(123.34);
//        System.out.println("equal or not :- " +x.equals(123));


//      method 2;*************************************************************************************
        Employee ob1 = new Employee(123, "Salman");
        Employee ob2 = new Employee(123, "Salman");
        int a = ob1.hashCode();
        int b = ob2.hashCode();
        System.out.println("equal or not " + ob1.equals(ob2));
        System.out.println("equal or not hashcode \n a=" + a + "\n b=" + b);


//       method 3 ; **********************************************************************************
//       equals method override in java object ;

    }
}
