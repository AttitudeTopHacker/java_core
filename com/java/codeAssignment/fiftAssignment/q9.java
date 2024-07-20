package com.java.codeAssignment.fiftAssignment;

import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(greatestnumber(arr, n));
        }
    }

    private static String greatestnumber(int[] arr, int n) {
        String[] arr1 = new String[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = String.valueOf(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                String s1 = arr1[min] + arr1[j];
                String s2 = arr1[j] + arr1[min];
                if (s2.compareTo(s1) > 0) {
                    min = j;
                }
            }
            String s = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = s;
        }

        if (arr1[0].charAt(0) == '0') {
            return "0";
        }
        String sum = "";
        for (int i = 0; i < n; i++) {
            sum += arr1[i];
        }

        return sum;
    }
}


//public String largestNumber(int[] nums) {
//    String[] s = new String[nums.length];
//    for(int i=0; i<nums.length; i++)  s[i] = String.valueOf(nums[i]);
//    Arrays.sort(s, (a,b) -> (b + a).compareTo(a + b));
//    return s[0].equals("0") ? "0" : String.join("",s);
//}