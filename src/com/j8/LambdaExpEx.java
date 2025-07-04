package com.j8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Sayable{
    public String say(String message);
}

public class LambdaExpEx {
    public static void main(String[] args) {
//        ArrayList<String> lan = new ArrayList<>();
//        lan.add("Java");
//        lan.add("Python");
//        lan.add("Go");
//        lan.add("Rust");
//
//        List<String> collect = lan.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);
//    Sayable s= (msg)->{
//        String s1="I would like to say, ";
//        String s2 =s1 + msg;
//        return s2;
//    };
//        System.out.println(s.say("time is precious."));
//
        //thread
        Runnable runnable = new Runnable(){
            public void run(){
                System.out.println("Thread1 is running...");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Runnable run=()->{
            System.out.println("Thread2 is running...");

        };
        Thread thread1 = new Thread(run);
        thread1.start();

    }

}
