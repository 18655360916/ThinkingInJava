package com.interfaces.filters;

public class BandPass extends Filter {
    double lowCutoff;
    double highCutoff;

    public BandPass(double lowCut, double highCut) {
        this.lowCutoff = lowCut;
        this.highCutoff = highCut;
    }

    public Waveform process(Waveform input) {
        return input;
    }
}
