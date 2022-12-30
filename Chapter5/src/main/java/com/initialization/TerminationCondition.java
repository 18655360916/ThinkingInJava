package com.initialization;

class Book {
    boolean checkedOut = false;

    Book(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalized() {
        if (checkedOut) {
            System.out.println("Error: checked out");
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkIn();

        new Book(true);
        System.gc();

    }

}
