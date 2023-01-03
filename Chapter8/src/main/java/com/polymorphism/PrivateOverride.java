package com.polymorphism;

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        Derived derived = new Derived();
        derived.f();

        PrivateOverride privateOverride = derived;
        privateOverride.f();

    }
}

class Derived extends PrivateOverride {
    public void f() {
        System.out.println("public f()");
    }
}
/*
public f()
private f()
 */