package com.odegova.interviewQuestions;

import java.util.Arrays;

public class Pyramid {

    private int length;

    public void pyramidRec(int n) {
        length = 1 + 2*(n - 1);
        pyramidRec(n, 0, "");
    }

    private void pyramidRec(int n, int row, String stair) {
        if (n == row) {
            return;
        }

        if (length == stair.length()) {
            System.out.println("'" + stair + "'");
            pyramidRec(n, row + 1, "");
            return;
        }

        int spaceLength = (length - (1 + 2*row)) / 2;

        if ((stair.length() < spaceLength) || (stair.length() >= length - spaceLength)) {
            stair += " ";
        } else {
            stair += "#";
        }
        pyramidRec(n, row, stair);
    }

    public void pyramid(int n) {
        int length = 1 + 2*(n - 1);
        String[][] arrs = new String[n][length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < length; j++) {
                int spaceLength = (length - (1 + 2*i)) / 2;
                if ((j < spaceLength) || (j >= length - spaceLength)) {
                    arrs[i][j] = " ";
                } else {
                    arrs[i][j] = "#";
                }
            }
            System.out.println("'" + String.join("", Arrays.asList(arrs[i])) + "'");
        }
    }
}
