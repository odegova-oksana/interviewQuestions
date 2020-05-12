package com.odegova.interviewQuestions;

public class Palindrome {

    public boolean check(String str) {
        String firstPart;
        String secondPart;
        if (str.length() % 2 == 1) {
            firstPart = str.subSequence(0, (str.length() - 1)/2).toString();
            secondPart = str.subSequence((str.length() - 1)/2 + 1, str.length()).toString();
        } else {
            firstPart = str.subSequence(0, str.length()/2).toString();
            secondPart = str.subSequence(str.length()/2, str.length()).toString();
        }
        return firstPart.equals(reverse(secondPart));
    }

    public boolean checkLess(String str) {
        return str.equals(reverse(str));
    }

    public boolean checkArr(String str) {
        for (int i = str.length()/2-1; i>=0; i--) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }

    private String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (String ch : str.split("")) {
            result.insert(0, ch);
        }
        return result.toString();
    }
}
