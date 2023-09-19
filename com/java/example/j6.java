package com.java.example;

import java.util.concurrent.ThreadLocalRandom;

public class j6 {
    public static void main(String [] args) {
//        method 1;
//        100- 200 ke under value ;
//        System.out.println(Math.random()*(200-100+1)+100);

//                method 2;
//        10 from above
//        System.out.println(Math.random()*10);

//             method 3 ;
//        random class use the java
//        Random random = new Random();
//        System.out.println( random.nextInt(50-10+1)+10);

//        method 4
        float a = ThreadLocalRandom.current().nextFloat(15,20);
        String str = String.format("%10f",a);
        System.out.println(a);
    }

}
