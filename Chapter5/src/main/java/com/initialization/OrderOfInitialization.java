package com.initialization;

class Window {
    Window(int marker) {
        System.out.println("Window(" + marker + ")");
    }
}

class House {
    Window w1 = new Window(1);

    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House house = new House();
        house.f();
    }

}
/*
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
 */