package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private static FizzBuzz test;

    @BeforeAll
    static void beforeAll() {
        test = new FizzBuzz();
    }

    @Test
    void getResult() {
        assertEquals("buzz", test.getResult(5));
        assertEquals("fizz", test.getResult(3));
        assertEquals("fizzbuzz", test.getResult(15));
        assertEquals("1", test.getResult(1));
        assertEquals("7", test.getResult(7));
        assertEquals("fizz", test.getResult(27));
    }

    @Test
    void printResult() {
        test.printResult(15);
    }
}