package com.java.Feb_6_2024;

/**
 * create by  mohd salman
 * Date : 06/02/24
 * Time : 12:39 pm
 * Project_Name : java_core
 */

public class lastIndexRecursion {
    public static void main(String[] args) {
        int[] ar = new int[]{2, 3, 4, 5, 3, 2, 6, 7, 8};
        System.out.println(lastAccurence(ar, 0, 0));
    }

    private static int lastAccurence(int[] ar, int data, int indx) {

        if (indx == ar.length) {
            return -1;  //sari call ho jaye tab -1 return karta hai;
        }
        System.out.print(indx + " ");
        int lastIndex = lastAccurence(ar, data, indx + 1);
//    lastIndex me -1 hai lastIndexRecursion  jav find kar leta hai index tab change hojata hai lastIndex jo ki \
//    find index hota  phir se compare na kare bahin return kar de isliye -1 check karna padega
        //
        if (lastIndex != -1) {
            return lastIndex;
        } else if (ar[indx] == data) {
            return indx;
        } else {
            return -1;
        }
    }

}