package com.java.pratice;

//srting and stringBuffer time Camparing in the java
class StringTimeCompare {
    private String str = "salman";
    private final StringBuffer st1 = new StringBuffer("salman");
    private final StringBuilder ste =new StringBuilder("salman");

    public void StringTotalTime() {
        for (int i = 0; i < 1000; i++) {
            str = str.concat("salman");
        }
    }

    public void StringBufferTotalTime() {
        st1.append("salman".repeat(1000));
    }
public void StringBuilderTotalTime(){

    ste.append("salman".repeat(1000));
}

}

public class p16 {
    public static void main(String[] args) {
        StringTimeCompare Start = new StringTimeCompare();
        long StartTime = System.currentTimeMillis();
        Start.StringBufferTotalTime();
        System.out.println("StringBuffer to time per ms :- " + (System.currentTimeMillis() - StartTime) + "second");

        StartTime = System.currentTimeMillis();
        Start.StringTotalTime();
        System.out.println("String to time per ms :- " + (System.currentTimeMillis() - StartTime)+ "second");


        StartTime = System.currentTimeMillis();
        Start.StringBuilderTotalTime();
        System.out.println("StringBuilder to time per ms :-"+(System.currentTimeMillis()-StartTime)+ "second");

    }
}
