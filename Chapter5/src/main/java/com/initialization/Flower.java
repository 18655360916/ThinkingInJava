package com.initialization;

public class Flower {
    int petalCount = 0; //花瓣计数
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }

    Flower(String ss) {
        s = ss;
        System.out.println("Constructor w/ String arg only, s = " + s);
    }

    Flower(String s, int petals) {
        this(petals);
//        this(s); //不能调用两次
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
//        this(22); //只能在构造器中调用
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
/*
Constructor w/ int arg only, petalCount= 47
String & int args
default constructor (no args)
petalCount = 47 s = hi
 */
