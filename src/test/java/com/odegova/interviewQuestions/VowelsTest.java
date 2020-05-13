package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelsTest {

    Vowels vowels;

    @BeforeEach
    void setUp() {
        vowels = new Vowels();
    }

    @Test
    void vowelsNumber() {
        assertAll("Test Vowels Set",
                () -> assertEquals(3, vowels.vowelsNumber("Hi There!"), "first test"),
                () -> assertEquals(4, vowels.vowelsNumber("Why do you ask"), "second test"),
                () -> assertEquals(0, vowels.vowelsNumber("Why?"), "third test"));

    }
}