package com.control;

import static com.util.Range.range;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : range(100)) {
            if (i == 74) {
                break;
            }
            if (i % 9 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        while (true) {
            i++;
            int j = i * 27;
            if (j == 1269) {
                break;
            }
            if (i % 10 != 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
/*
0 9 18 27 36 45 54 63 72
0 9 18 27 36 45 54 63 72
10 20 30 40
 */