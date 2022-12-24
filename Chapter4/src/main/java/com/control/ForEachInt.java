package com.control;

import static com.util.Range.range;

public class ForEachInt {
    public static void main(String[] args) {
        for (int i : range(10)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : range(5, 10)) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i : range(5, 20, 3)) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
/*
0 1 2 3 4 5 6 7 8 9
5 6 7 8 9
5 8 11 14 17
 */