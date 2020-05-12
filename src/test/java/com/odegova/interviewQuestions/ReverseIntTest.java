package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntTest {

    private static ReverseInt test;

    @BeforeAll
    static void beforeAll() {
        test = new ReverseInt();
    }

    @Test
    void reverse() {
        assertEquals(51, test.reverse(15));
        assertEquals(189, test.reverse(981));
        assertEquals(5, test.reverse(500));
        assertEquals(-51, test.reverse(-15));
        assertEquals(-9, test.reverse(-90));
    }

}