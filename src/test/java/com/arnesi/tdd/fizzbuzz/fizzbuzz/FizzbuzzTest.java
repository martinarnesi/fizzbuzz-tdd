package com.arnesi.tdd.fizzbuzz.fizzbuzz;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
@DisplayName("FizzBuzz TDD Demo")
class FizzbuzzTest {

	@Test
	@DisplayName("Disable me when the demo starts")
	@Disabled("Disabled")
	void textNull() {
		assertNull(Fizzbuzz.fizzBuzz(3));
	}

	/*
	* Implementing FIZZ-BUZZ:
	* Write an algorithm that take a positive number N,
	* If the number if multiples of 3, return the String “Fizz”,
	* If the number if multiples of 5, return "Buzz",
	* and if number if multiples of both 3 and 5, return “FizzBuzz”,
	* otherwise return N
	*
	* We can Fake it or we can Make it.. your call...
	* */

	@Test
	@DisplayName("Input value must contain a number higher than 0")
	void shouldBePositive() {
		assertEquals("Number out of range", Fizzbuzz.fizzBuzz(0));
	}


	@Test
	@DisplayName("that take a number N")
	void shouldPrintNumber() {
		assertEquals("1", Fizzbuzz.fizzBuzz(1));
	}

	@Test
	@DisplayName("return the String “Fizz”")
	void shouldPrintFizz() {
		assertEquals("Fizz", Fizzbuzz.fizzBuzz(3));
	}

	@Test
	@DisplayName("return the String “Buzz”")
	void shouldPrintBuzz() {
		assertEquals("Buzz", Fizzbuzz.fizzBuzz(5));
		assertEquals("Buzz", Fizzbuzz.fizzBuzz(10));
	}

	@Test
	@DisplayName("return the String “Fizz-Buzz”")
	void shouldPrintFizzBuzz() {
		assertEquals("FizzBuzz", Fizzbuzz.fizzBuzz(15));
		assertEquals("FizzBuzz", Fizzbuzz.fizzBuzz(30));
	}
}
