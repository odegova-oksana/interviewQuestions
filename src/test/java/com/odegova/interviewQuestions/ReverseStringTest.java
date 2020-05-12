package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    private static ReverseString test;

    @BeforeAll
    static void beforeAll() {
        test = new ReverseString();
    }

    @Test
    void reverse() {
        assertEquals("elppa", test.reverse("apple"));
        assertEquals("olleh", test.reverse("hello"));
        assertEquals("!sgniteerG", test.reverse("Greetings!"));
    }

    @Test
    void reverseArr() {
        assertEquals("elppa", test.reverseArr("apple"));
        assertEquals("olleh", test.reverseArr("hello"));
        assertEquals("!sgniteerG", test.reverseArr("Greetings!"));
    }

    @Test
    void reverseForeach() {
        assertEquals("elppa", test.reverseForeach("apple"));
        assertEquals("olleh", test.reverseForeach("hello"));
        assertEquals("!sgniteerG", test.reverseForeach("Greetings!"));
    }
}