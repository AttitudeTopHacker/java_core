package com.java.pratice;

import java.util.Arrays;
import java.util.Scanner;

//array
public class p1<T> {
    static void method1() {
        int[] a = {4, 5, 6, 3, 3};
        for (int j : a) System.out.println("a[]=" + j);
    }

    static void method2() {
        int[] a = {3, 5, 4, 5, 6};
        for (int element : a) {
            System.out.println("ab[]=" + element);
        }
    }

    static void method3(int[] a) {
        for (int element : a) {
            System.out.println("abc[]=" + element);
        }
    }

    static int[] method4(int numberOfIndex, Scanner sc) {
        int[] a = new int[numberOfIndex];
        System.out.println("enter the number of array :-");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;

    }

    static void methode5() {
        int[][] a = {{2, 3, 4,}, {5, 8, 4}, {6, 5, 2}};
        for (int[] element : a) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(element[j] + " ");
//            }
            Arrays.stream(element).mapToObj(anInt -> anInt + "    ").forEachOrdered(System.out::print);
            System.out.println();
        }
    }

    static void methode6() {
        int[][] a = new int[3][];
        a[0] = new int[3];
        a[1] = new int[4];
        a[2] = new int[2];
        int Count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = Count++;
            }
        }
        for (int[] ints : a) {
            Arrays.stream(ints).mapToObj(anInt -> anInt + " ").forEachOrdered(System.out::print);
            System.out.println();//new line
      /*      int j = 0;
            while (j < element.length) {
                System.out.print(element[j] + " ");
                j++;
            }*/
        }
    }

    static void methode7() {
        int[] arr = {5, 6, 3, 2};
//        Class name =arr.getClass();
        int[] jrr = {5, 5, 3, 3, 6};

        Class<? extends int[]> name2 = jrr.getClass();
        System.out.println(jrr.getClass());
        System.out.println(name2);
        float[] pp = {5, 3, 3};
        System.out.println(pp.getClass().getSimpleName());
        Class<?> namee = pp.getClass();
        System.out.println(namee);
        Class<? extends int[]> name = arr.getClass();
        System.out.println(name);
        System.out.println(name.getSimpleName());
        System.out.println(arr.getClass().getSimpleName());
        Arrays.stream(arr).mapToObj(anInt -> anInt + " ").forEachOrdered(System.out::print);
    }

    static void methode8() {
        int[] a = {5, 3, 2, 1, 8};
        for (int element : a) {
            System.out.println("real data =" + element);
        }
        int[] a1 = a.clone();
        for (int element : a1) {
            System.out.println("copy data of clone =" + element);
        }
    }

    static void methode9() {
        char[] a = {'a', 'b', 'c', 'd', 'y'};
        char[] copy = new char[4];
        System.arraycopy(a, 1, copy, 0, copy.length);
        for (char element : copy)
            System.out.println("copy arry index=" + element);

    }

    //    anoymousClass()
    static void method10(int[] a) {
        for (int element : a)
            System.out.println(element);
    }

    public static void main(String[] args) {
//        method1 +++++++++++++++++++++++++++++++++++++++++++++++++
//        method1();
//        System.out.println(" ");
////        method2  ++++++++++++++++++++++++++++++++++++++++++++++++
//        method2();
//        System.out.println(" ");
////        method3  ++++++++++++++++++++++++++++++++++++++++++++++++
//        int[] a = {4, 9, 5, 4, 64,};
//        method3(a);
////        method4  +++++++++++++++++++++++++++++++++++++++++++++++
//        System.out.println("method 4 :- ");
//        System.out.println("enter the arrayOfIndex number :- ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int[] arr = method4(num, sc);
//        System.out.println("return of the array :-");
//        for (int element : arr)
//            System.out.println("arr return=" + element);
//        System.out.println("the");
//        System.out.println(arr.getClass().getSimpleName());
//        method5  +++++++++++++++++++++++++++++++++++++++++++++++++
//        System.out.println("the method 5 :-");
//        methode5();
//        System.out.println();
//        method6  ++++++++++++++++++++++++++++++++++++++++++++++++
//        methode6();
//        System.out.println();
//        method7  ++++++++++++++++++++++++++++++++++++++++++++++++
//        Arrays find the class\
        methode7();
//          method8
//        clone array in the of element
//        methode8();
////        methode9
        methode9();
//        System.out.println();
//        method10
//        method10(new int[] {2, 3, 4, 5, 6, 7, 8, 9});
    }

}
