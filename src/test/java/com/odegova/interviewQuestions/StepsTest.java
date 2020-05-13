package com.odegova.interviewQuestions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StepsTest {

    @Test
    void steps() {
        Steps steps = new Steps();
        steps.steps(4);
    }

    @Test
    void stepsApache() {
        Steps steps = new Steps();
        steps.stepsApache(4);
    }

    @Test
    void stepsArr() {
        Steps steps = new Steps();
        steps.stepsArr(4);
    }

    @Test
    void printNumber() {
        Steps steps = new Steps();
        steps.printNumber(10);
    }

    @Test
    void stepsRec() {
        Steps steps = new Steps();
        steps.stepsRec(4);
    }
}