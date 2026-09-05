package com.LC;

import java.util.Random;

public class LuckyNo {

    public static void main(String[] args) {

        int year = 0;

        Random randomNumber = new Random(); // create an instance of the Random class named as randomNumber

        // get a random number between 1 to 12
        int luckyNumber = randomNumber.nextInt(12);

        // get the digits in the ones, tens, hundreds and thousands place of the birth year
        // % means modulus (mod) in Java and it calculates the remainder after division
        // e.g. if the year = 2013
        int onesDigit = year % 10; // onesDigit = 3
        int tensDigit = year / 10 % 10; // tensDigit = 1
        int hundredsDigit = year / 100 % 10; // hundredsDigit = 0
        int thousandsDigit = year / 1000 % 10; // thousandsDigit = 2

        // raise number to the power of 4
        double powerDigit = Math.pow(thousandsDigit, 4);

        // add and subtract some digits from the birth year
        int result = onesDigit - hundredsDigit + tensDigit;

        // add result with the randomly generated number
        luckyNumber += result; // Addition assignment. Same as: luckyNumber = luckyNumber + result;

        System.out.println("* Your lucky number is: " + luckyNumber);

    }
}
