package com.odegova.interviewQuestions;

public class FizzBuzz {

    public void printResult(int value) {
        for (int i = 1; i <= value; i++) {
            System.out.println(getResult(i));
        }
    }

    public String getResult(int value) {
        StringBuilder result = new StringBuilder();
        if ((value % 3 == 0) || (value % 5 == 0)) {
            if (value % 3 == 0) {
                result.append("fizz");
            }
            if (value % 5 == 0) {
                result.append("buzz");
            }
            return result.toString();
        } else {
            return String.valueOf(value);
        }
    }

}
