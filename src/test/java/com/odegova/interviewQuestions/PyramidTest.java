package com.odegova.interviewQuestions;

import org.junit.jupiter.api.Test;

class PyramidTest {

    @Test
    void pyramidRec() {
        Pyramid pyramid = new Pyramid();
        pyramid.pyramidRec(4);
    }

    @Test
    void pyramid() {
        Pyramid pyramid = new Pyramid();
        pyramid.pyramid(4);
    }

}