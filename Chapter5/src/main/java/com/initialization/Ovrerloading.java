package com.initialization;

class Tree {
    int height;

    Tree() {
        System.out.println("planting a seedling");
        height = 0;
    }


    Tree(int height) {
        this.height = height;
        System.out.println("Creating new Tree that is " + this.height + " feet tall");
    }

    void info() {
        System.out.println("Tree is " + height + " feet tall");
    }

    void info(String s) {
        System.out.println(s + ": Tess is " + height + " feet tall");
    }
}

public class Ovrerloading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
/*
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tess is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tess is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tess is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tess is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tess is 4 feet tall
planting a seedling
 */
