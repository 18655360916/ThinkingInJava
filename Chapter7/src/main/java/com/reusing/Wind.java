package com.reusing;

class Instrument {
    public void play() {

    }

    static void tune(Instrument instrument) {
        instrument.play();
    }
}

public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind wind = new Wind();
        Instrument.tune(wind);
    }
}
