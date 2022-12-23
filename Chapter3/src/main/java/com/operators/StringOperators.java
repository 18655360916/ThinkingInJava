package com.operators;

import static com.util.Print.print;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0;
        int y = 1;
        int z = 2;
        String s = "x, y, z ";
        print(s + x + y + z);

        print(x + " " + s);

        s += "(summed) = ";
        print(s + (x + y + z));

        //Integer.toString();
        print("" + x);
    }
}
/*
x, y, z 012
0 x, y, z
x, y, z (summed) = 3
0
 */