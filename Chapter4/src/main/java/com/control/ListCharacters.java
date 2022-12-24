package com.control;

public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128; c++) {
            if (Character.isLowerCase(c)) {
                System.out.println("value: " + (int) c + " Chatacter: " + c);
            }
        }
    }
}
/*
value: 97 Chatacter: a
value: 98 Chatacter: b
value: 99 Chatacter: c
value: 100 Chatacter: d
value: 101 Chatacter: e
value: 102 Chatacter: f
value: 103 Chatacter: g
value: 104 Chatacter: h
value: 105 Chatacter: i
value: 106 Chatacter: j
value: 107 Chatacter: k
value: 108 Chatacter: l
value: 109 Chatacter: m
value: 110 Chatacter: n
value: 111 Chatacter: o
value: 112 Chatacter: p
value: 113 Chatacter: q
value: 114 Chatacter: r
value: 115 Chatacter: s
value: 116 Chatacter: t
value: 117 Chatacter: u
value: 118 Chatacter: v
value: 119 Chatacter: w
value: 120 Chatacter: x
value: 121 Chatacter: y
value: 122 Chatacter: z
 */