package com.sdacademy.abstrakcje.agd.zad2;

public class Prostokat extends Ksztalt {

    double bokA;
    double bokB;

    public double getBokA() {
        return bokA;
    }

    public void setBokA(double bokA) {
        this.bokA = bokA;
    }

    public double getBokB() {
        return bokB;
    }

    public void setBokB(double bokB) {
        this.bokB = bokB;
    }

    public Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public String toString() {
        return "Prostokat o boku A: " + bokA + " i boku B: " + bokB + " ma pole: " + obliczPole();
    }
}
