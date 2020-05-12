package com.odegova.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

    public String reverse(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    public String reverseForeach(String str) {
        StringBuilder result = new StringBuilder();
        for (String ch : str.split("")) {
            result.insert(0, ch);
        }
        return result.toString();
    }

    public String reverseArr(String str) {
        List<String> listOfProducts = Arrays.asList(str.split(""));
        Collections.reverse(listOfProducts);
        return String.join("", listOfProducts);
    }

}
