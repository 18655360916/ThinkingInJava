package com.control;

public class CommaOprator {
    public static void main(String[] args) {
        for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i = " + i + " j = " + j);
        }
    }
}
/*
i = 1 j = 11
i = 2 j = 4
i = 3 j = 6
i = 4 j = 8
 */