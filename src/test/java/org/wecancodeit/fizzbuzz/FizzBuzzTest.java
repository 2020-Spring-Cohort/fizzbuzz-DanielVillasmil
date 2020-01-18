package org.wecancodeit.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void tneShouldSayOne() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(1);
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
    public void fiveShouldSayBuzz(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(5);
        assertEquals("Buzz", result);
    }
    @Test
    public void elevenShouldSayBang(){
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(11);
        assertEquals("BANG", result);
    }
    @Test
    public void fifteenShouldSayFizzBuzz() {
        FizzBuzz underTest = new FizzBuzz();
        String result = underTest.interpret(15);
        assertEquals("FizzBuzz", result);
    }

}

