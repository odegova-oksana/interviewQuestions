package com.odegova.interviewQuestions;


import org.apache.commons.lang.StringUtils;

import java.util.Arrays;

public class Steps {

    public void stepsRec(int n) {
        stepsRec(n, 0, "");
    }

    private void stepsRec(int n, int row, String stair) {
        if (n == row) {
            return;
        }

        if (n == stair.length()) {
            System.out.println("'" + stair + "'");
            stepsRec(n, row + 1, "");
            return;
        }

        if (stair.length() <= row) {
            stair += "#";
        } else {
            stair += " ";
        }
        stepsRec(n, row, stair);
    }

    public void steps(int value) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= value; i++) {
            sb.append("#");
            System.out.println("'" + sb.toString() + repeat(value - i, " ") + "'");
        }
    }

    private String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public void stepsArr(int value) {
        String[][] arrs = new String[value][value];
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                if (j <= i) {
                    arrs[i][j] = "#";
                } else {
                    arrs[i][j] = " ";
                }
            }
            System.out.println("'" + String.join("", Arrays.asList(arrs[i])) + "'");
        }
    }

    public void stepsApache(int value) {
        for (int i = 1; i <= value; i++) {
            System.out.println("'" + StringUtils.repeat("#", i) + StringUtils.repeat(" ", value - i) + "'");
        }
    }

    public void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }
}
