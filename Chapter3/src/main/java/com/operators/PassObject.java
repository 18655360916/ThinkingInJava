package com.operators;

import static com.util.Print.print;

class Letter {
    char c;
}

public class PassObject {
    static void f(Letter y) {
        y.c = 'c';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        print("1: x.c: " + x.c);
        f(x);
        print("2: x.c: " + x.c);
    }
}
/*
1: x.c: a
2: x.c: c
 */
