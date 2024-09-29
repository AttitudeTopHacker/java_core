package com.java.lecture;

public class jun24_8queen {
    public static void main(String[] args) {
    boolean []nob = new boolean[4];
        possibleCombination(nob,0,2,"");

    }
    private static void possibleCombination(boolean[] nob, int cq ,int noq, String ans) {
        if(noq==cq){
            System.out.println(ans);
            return;
        }  
        for(int i=0;i<nob.length;i++){
            if(nob[i]==false){
                nob[i]=true;
                possibleCombination(nob,cq+1,noq,ans+"q"+cq+"b"+i);
                nob[i]=false;
            }

        }
    }
}
