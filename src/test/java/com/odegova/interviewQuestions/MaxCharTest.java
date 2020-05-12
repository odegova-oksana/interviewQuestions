package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxCharTest {

    private static MaxChar test;

    @BeforeAll
    static void beforeAll() {
        test = new MaxChar();
    }

    @Test
    void mostCommon() {
        assertEquals("c", test.mostCommon("abccccccd"));
        assertEquals("1", test.mostCommon("apple 12311119"));
    }
}