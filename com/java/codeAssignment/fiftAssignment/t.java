package com.java.codeAssignment.fiftAssignment;

import java.util.Scanner;

public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String  s = sc.nextLine();
        int count =0;
        boolean visited[] =  new boolean[n];
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length()-i; j++) {
                long l = Long.parseLong(s.substring(j, j+i));
                System.out.println(l);
                if(isCB(l) && checkifvisted(visited, j, j+i)) {
//                    System.out.println(l);
                    count++;
                    for (int k = j; k < j+i; k++) {
                        visited[k] =true;
                    }
                }
            }
        }

        System.out.println(count);

    }

    public static boolean isCB(long l) {
        int arr[] = { 2,3,5,7,11,13,17,19,23,29 };
        if(l == 1 || l==0) { //point 1
            return false;
        }

        for (int i = 0; i < arr.length; i++) {//point 2
            if(l==arr[i]) {
                return true;
            }
        }

        for (int i = 0; i < arr.length; i++) { //point 3
            if(l%arr[i]==0) {
                return false;
            }
        }

        return true;

    }

    public static boolean checkifvisted(boolean visited[], int i, int j) {

        for (int k = i; k < j; k++) {
            if(visited[k] == true) {
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}
