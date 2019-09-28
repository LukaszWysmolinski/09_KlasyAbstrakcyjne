package com.sdacademy.abstrakcje.agd.zad2;

public class Trojkat extends Ksztalt {

    double podstawa;
    double wysokosc;

    public double getPodstawa() {
        return podstawa;
    }

    public void setPodstawa(double podstawa) {
        this.podstawa = podstawa;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Trojkat(double podstawa, double wysokosc) {
        this.podstawa = podstawa;
        this.wysokosc = wysokosc;
    }

    @Override
    double obliczPole() {
        return (podstawa*wysokosc)/2;
    }

    @Override
    public String toString() {
        return "Trojkat o podstawie: "+podstawa+" i wysokosci: "+wysokosc+" ma pole: "+obliczPole();
    }
}
