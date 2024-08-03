package com.java.lecture;

public class may24_19_substring {
    public static void main(String[] args) {
        String st = "74591";
        boolean[] cbexist = new boolean[st.length()];
        for (int i = 1; i <= st.length(); i++) {
            for (int j = 0; j <= st.length() - i; j++) {
                String temp = st.substring(j, j + i);
                if (itsCB(temp) && cbexitsORnot(j, j + i, cbexist)) {
                    for (int k = j; k < j + i; k++) {
                        cbexist[k] = true;
                    }
                    System.out.println(temp);
                }
            }
        }
    }

    private static boolean cbexitsORnot(int i, int j, boolean[] cbexist) {
        for (int k = i; k < j ; k++) {
            if (cbexist[k] == true) {
                return false;
            }
        }
        return true;

    }

    private static boolean itsCB(String substring) {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int val = Integer.parseInt(substring);
        if (val == 0 || val == 1) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                return true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (val % arr[i] == 0) {
                return false;
            }
        }
        return true;
    }
}
