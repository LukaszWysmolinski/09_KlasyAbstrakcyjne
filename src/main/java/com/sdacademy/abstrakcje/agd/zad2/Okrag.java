package com.sdacademy.abstrakcje.agd.zad2;

public class Okrag extends Ksztalt {
    double promien;

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public Okrag(double promien) {
        this.promien = promien;
    }

    @Override
    double obliczPole() {
        return Math.PI * Math.pow(promien, 2);
    }

    @Override
    public String toString() {
        return "Okrag o promieniu: " + promien + " ma pole: " + obliczPole();
    }
}
