package com.odegova.interviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {

    public boolean isAnagram(String str1, String str2) {
        HashMap<String, Integer> map1 = populateMap(str1);
        HashMap<String, Integer> map2 = populateMap(str2);

        if (map1.size() != map2.size()) {
            return false;
        }

        for (String key : map1.keySet()) {
            if (!map1.get(key).equals(map2.get(key))) {
                return false;
            }
        }

        return true;
    }

    public boolean isAnagramSort(String str1, String str2) {
        return cleanString(str1).equals(cleanString(str2));
    }

    private String cleanString(String str) {
        for (String item : str.split("")) {
            if (!item.matches("[a-zA-Z]")) {
                str = str.replace(item, "");
            }
        }
        String[] arr = str.toLowerCase().split("");
        Arrays.sort(arr);
        return Arrays.toString(arr);
    }

    private HashMap<String, Integer> populateMap(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String item : str.split("")) {
            if (item.matches("[a-zA-Z]")) {
                map.merge(item.toLowerCase(), 1, Integer::sum);
            }
        }
        return map;
    }
}
