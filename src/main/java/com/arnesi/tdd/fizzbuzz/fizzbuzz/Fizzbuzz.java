package com.arnesi.tdd.fizzbuzz.fizzbuzz;

public class Fizzbuzz {

    private static final String OUT_OF_RANGE = "Number out of range";

    public static String fizzBuzz(final Integer n) {
        if(n <= 0) {
            return OUT_OF_RANGE;
        }

        if(n % 3 == 0 && n % 5 == 0){
            return "FizzBuzz";
        } else if (n % 5 == 0){
            return "Buzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else {
            return n.toString();
        }
    }

    private static boolean isDivisibleByThree(Integer n){
        return n % 3 == 0;
    }

    private static boolean isDivisibleByFive(Integer n){
        return n % 5 == 0;
    }

}