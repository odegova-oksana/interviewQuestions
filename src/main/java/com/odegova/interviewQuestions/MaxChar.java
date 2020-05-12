package com.odegova.interviewQuestions;

import java.util.HashMap;

public class MaxChar {

    public String mostCommon(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String item : str.split("")) {
            map.merge(item, 1, Integer::sum);
        }
        int max = 0;
        String result = "";
        for (String key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                result = key;
            }
        }
        return result;
    }

}
