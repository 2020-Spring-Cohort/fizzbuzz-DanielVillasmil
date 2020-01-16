package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void oneShouldSayOne() {
        // Arrange
        FizzBuzz underTest = new FizzBuzz();
        //Action
        String result = underTest.interpret(1);
        //Assertion
        assertEquals("1", result);
    }

    @Test
    public void twoShouldSayTwo() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(2);
        assertEquals("2", result);
    }

    @Test
    public void threeShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(3);
        assertEquals("Fizz", result);

    }

    @Test
    public void fourShouldSayFour() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(4);
        assertEquals("4", result);

    }

    @Test
    public void fiveShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void sixShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void nineShouldSayFizz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(9);
        assertEquals("Fizz", result);
    }

    @Test
    public void tenShouldSayBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void fifteenShouldSayFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void thirtyShouldSayFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(30);
        assertEquals("FizzBuzz", result);
    }
}
