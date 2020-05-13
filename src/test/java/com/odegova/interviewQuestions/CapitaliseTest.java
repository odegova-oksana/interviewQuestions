package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitaliseTest {

    Capitalise capitalise;

    @BeforeEach
    void setUp() {
        capitalise = new Capitalise();
    }

    @Test
    void capitalise() {
        assertAll("Test Capitalise Set",
                () -> assertEquals("A Short Sentence", capitalise.capitalise("a short sentence"), "first test"),
                () -> assertEquals("A Lazy Fox", capitalise.capitalise("a lazy fox"), "second test"),
                () -> assertEquals("Look, It Is Working!", capitalise.capitalise("look, it is working!"), "third test"));
    }

    @Test
    void capitaliseApache() {
        assertAll("Test Capitalise Apache Set",
                () -> assertEquals("A Short Sentence", capitalise.capitaliseApache("a short sentence"), "first test"),
                () -> assertEquals("A Lazy Fox", capitalise.capitaliseApache("a lazy fox"), "second test"),
                () -> assertEquals("Look, It Is Working!", capitalise.capitaliseApache("look, it is working!"), "third test"));
    }
}