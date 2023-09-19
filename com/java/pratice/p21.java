package com.java.pratice;

//inner and class and outer class create object static and non static in the java ;
class Outer {
    //    class Inner {
    static class Inner {
    }
public class p21 {

    public static void main(String[] args) {
        Outer outer = new Outer();
//      Outer.Inner inner = outer.new Inner();  // without static create object
        Outer.Inner inner = new Outer.Inner(); // Static inner class create object in the java ;
    }
}}
