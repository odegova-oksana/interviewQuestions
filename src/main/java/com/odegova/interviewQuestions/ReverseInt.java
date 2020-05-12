package com.odegova.interviewQuestions;

public class ReverseInt {

    public int reverse(int value) {
        boolean minus = value < 0;
        String str = String.valueOf(minus ? Math.abs(value) : value);
        String result = reverse(str);
        return Integer.parseInt(minus ? "-" + result : result);
    }

    private String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
