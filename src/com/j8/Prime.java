package com.j8;

import java.util.stream.IntStream;

public class Prime {
    public static void main(String[] args) {
        int num = 4;
        boolean isPrime = num > 1 && IntStream.range(2, num).noneMatch(i -> num % i == 0);
        System.out.println(num + " is prime : " + isPrime);

       if(isPrime(num)){
           System.out.println(num+" is a prime number");
       }
       else {
           System.out.println(num+" is not a prime number");
       }
    }

    //another way
    public static boolean isPrime(int number){
        if(number<=1){
            return false;
        }
        return IntStream.rangeClosed(2,(int)Math.sqrt(number)).noneMatch(n->number%n==0);
    }
}
