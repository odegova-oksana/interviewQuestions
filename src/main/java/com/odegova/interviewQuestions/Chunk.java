package com.odegova.interviewQuestions;

import java.util.Arrays;

public class Chunk {

    public String chunk(int[] arr, int value) {
        value = Math.min(arr.length, value);
        int chunks = arr.length / value + (arr.length % value == 0 ? 0 : 1);
        int[][] result = new int[chunks][value];
        for (int i = 0; i < chunks; i++) {
            for (int j = 0; j < value; j++) {
                if (i*value + j < arr.length) {
                    result[i][j] = arr[i*value + j];
                }
            }
            System.out.println(i + " : " + Arrays.toString(result[i]));
        }
        return Arrays.deepToString(result);

    }

}
