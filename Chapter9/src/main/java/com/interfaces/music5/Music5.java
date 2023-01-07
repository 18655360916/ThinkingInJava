package com.interfaces.music5;

import com.music4.Note;

interface Instrument {
    int Value = 5;

    void play(Note n);

    void adjust();
}

class Wind implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play()" + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {

    @Override
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    @Override
    public void adjust() {
        System.out.println(this + ".adjust()");
    }

    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class WoodWind extends Wind {
    public String toString() {
        return "WoodWind";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind(),
        };
        tuneAll(orchestra);
    }
}
/*
Wind.play()MIDDLE_C
Percussion.play() MIDDLE_C
Stringed.play() MIDDLE_C
Brass.play()MIDDLE_C
WoodWind.play()MIDDLE_C
 */