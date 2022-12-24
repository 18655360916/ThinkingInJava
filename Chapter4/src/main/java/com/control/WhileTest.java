package com.control;

public class WhileTest {
    static boolean condition() {
        // 包括0,不包括1.  [0, 1)的一个double值.
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("Inside 'While'");
        }
        System.out.println("Exited 'While'");
    }
}
























