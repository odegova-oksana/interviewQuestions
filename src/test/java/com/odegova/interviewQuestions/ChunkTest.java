package com.odegova.interviewQuestions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChunkTest {

    private static Chunk test;

    @BeforeAll
    static void beforeAll() {
        test = new Chunk();
    }

    @Test
    void chunk() {
        int[] arr = {1,2,3,4};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {1,2,3,4,5,6,7,8};
        assertEquals("[[1, 2], [3, 4]]", test.chunk(arr, 2));
        assertEquals("[[1, 2], [3, 4], [5, 0]]", test.chunk(arr2, 2));
        assertEquals("[[1, 2, 3], [4, 5, 6], [7, 8, 0]]", test.chunk(arr3, 3));
        assertEquals("[[1, 2, 3, 4], [5, 0, 0, 0]]", test.chunk(arr2, 4));
        assertEquals("[[1, 2, 3, 4, 5]]", test.chunk(arr2, 10));
    }
}