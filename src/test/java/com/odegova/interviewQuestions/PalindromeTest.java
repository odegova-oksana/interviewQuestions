package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeTest {

    private static Palindrome test;

    @BeforeAll
    static void beforeAll() {
        test = new Palindrome();
    }

    @Test
    void check() {
        assertEquals(true, test.check("abba"));
        assertEquals(true, test.check("abhba"));
        assertEquals(false, test.check("abcdef"));
    }

    @Test
    void checkLess() {
        assertEquals(true, test.checkLess("abba"));
        assertEquals(true, test.checkLess("abhba"));
        assertEquals(false, test.checkLess("abcdef"));
    }

    @Test
    void checkArr() {
        assertEquals(true, test.checkArr("abba"));
        assertEquals(true, test.checkArr("abhba"));
        assertEquals(false, test.checkArr("abcdef"));
    }
}