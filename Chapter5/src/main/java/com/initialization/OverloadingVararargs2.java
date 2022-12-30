package com.initialization;

public class OverloadingVararargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
//        f('a', 'b'); //因为float是可以接收char的.
    }

}
