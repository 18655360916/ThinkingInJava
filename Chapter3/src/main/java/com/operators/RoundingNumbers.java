package com.operators;

import static com.util.Print.print;

public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7;
        double below = 0.4;

        float fabove = 0.7f;
        float fbelow = 0.4f;

        print("Math.roud(above): " + Math.round(above));
        print("Math.roud(below): " + Math.round(below));
        print("Math.roud(fabove): " + Math.round(fabove));
        print("Math.roud(fbelow): " + Math.round(fbelow));
    }
}
/*
Math.roud(above): 1
Math.roud(below): 0
Math.roud(fabove): 1
Math.roud(fbelow): 0
 */