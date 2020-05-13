package com.odegova.interviewQuestions;

import org.springframework.util.StringUtils;

import java.util.Arrays;

public class Capitalise {

    public String capitalise(String str) {
        String[] strings = str.split(" ");
        for (int i = 0; i<strings.length; i++) {
            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
        }
        return String.join(" ", Arrays.asList(strings));
    }

    public String capitaliseApache(String str) {
        String[] strings = str.split(" ");
        for (int i = 0; i<strings.length; i++) {
            strings[i] = StringUtils.capitalize(strings[i]);
        }
        return String.join(" ", Arrays.asList(strings));
    }

}
