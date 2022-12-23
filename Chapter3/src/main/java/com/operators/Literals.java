package com.operators;

import static com.util.Print.print;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        print("i1: " + Integer.toBinaryString(i1));
        int i2 = 0x2F;
        print("i2: " + Integer.toBinaryString(i2));
        int i3 = 0_177;
        print("i3: " + Integer.toBinaryString(i3));

        char c = 0xffff;
        print("c: " + Integer.toBinaryString(c));

        byte b = 0x7f;
        print("b: " + Integer.toBinaryString(b));

        short s = 0x7fff;
        print("s: " + Integer.toBinaryString(s));

        long n1 = 200;
        long n2 = 200L;
        long n3 = 200l;
        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;
        double d1 = 1;
        double d2 = 1d;
        double d3 = 1D;
    }
}
/*
i1: 101111
i2: 101111
i3: 1111111
c: 1111111111111111
b: 1111111
s: 111111111111111
 */
