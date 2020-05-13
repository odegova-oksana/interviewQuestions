package com.odegova.interviewQuestions;

public class Vowels {

    public int vowelsNumber(String str) {
        int n = 0;
        for (String item : str.split("")) {
            if (item.matches("[aAeEoOuUiI]")) n++;
        }
        return n;
    }

}
