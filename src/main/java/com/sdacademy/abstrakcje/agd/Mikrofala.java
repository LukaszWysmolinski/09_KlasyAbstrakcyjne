package com.sdacademy.abstrakcje.agd;

import javax.sound.midi.Soundbank;

public class Mikrofala extends UrzadzenieAgd {
        private boolean rozmrazanie;

    public boolean isRozmrazanie() {
        return rozmrazanie;
    }

    public void setRozmrazanie(boolean rozmrazanie) {
        this.rozmrazanie = rozmrazanie;
    }

    public Mikrofala(String nazwa, double ciezar, String klasaEnergetyczna, boolean rozmrazanie) {
        super(nazwa, ciezar, klasaEnergetyczna);
        this.rozmrazanie = rozmrazanie;
    }

    @Override
    void opis() {
        System.out.println("Mikrofalowka: "+getNazwa());
        System.out.print("Szybkie rozmrazanie: ");
        if (rozmrazanie) {
            System.out.println("TAK");
        } else{
            System.out.println("NIE");
        }
    }
}
