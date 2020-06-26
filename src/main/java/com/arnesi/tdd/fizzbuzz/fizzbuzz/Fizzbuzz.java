package com.arnesi.tdd.fizzbuzz.fizzbuzz;

public class Fizzbuzz {

    private static final String OUT_OF_RANGE = "Number out of range";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";

    public static String fizzBuzz(final Integer n) {
        if(n <= 0) {
            return OUT_OF_RANGE;
        }

        if(isDivisibleByThree(n) && isDivisibleByFive(n)){
            return FIZZ+BUZZ;
        } else if (isDivisibleByFive(n)){
            return BUZZ;
        } else if (isDivisibleByThree(n)) {
            return FIZZ;
        } else {
            return n.toString();
        }
    }

    private static boolean isDivisibleByFive(Integer n) {
        return n % 5 == 0;
    }

    private static boolean isDivisibleByThree(Integer n) {
        return n % 3 == 0;
    }
}