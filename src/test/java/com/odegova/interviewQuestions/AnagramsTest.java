package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

    Anagrams anagrams;

    @BeforeEach
    void setUp() {
        anagrams = new Anagrams();
    }

    @Test
    void isAnagram() {
        assertAll("Test Anargrams Set",
                () -> assertEquals(true, anagrams.isAnagram("rail safety", "fairy tales"), "first test"),
                () -> assertEquals(true, anagrams.isAnagram("RAIL! SAFETY!", "fairy tales"), "second test"),
                () -> assertEquals(false, anagrams.isAnagram("Hi there", "Bye there"), "third test"));
    }

    @Test
    void isAnagramSort() {
        assertAll("Test AnargramsSort Set",
                () -> assertEquals(true, anagrams.isAnagramSort("rail safety", "fairy tales"), "first test"),
                () -> assertEquals(true, anagrams.isAnagramSort("RAIL! SAFETY!", "fairy tales"), "second test"),
                () -> assertEquals(false, anagrams.isAnagramSort("Hi there", "Bye there"), "third test"));
    }
}