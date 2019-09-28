package com.sdacademy.abstrakcje.agd;

public class Lodowka extends UrzadzenieAgd {

    private byte minTemperaturaChlodziarki;
    private byte minTemperaturaZamrazarki;

    public Lodowka(String nazwa, double ciezar, String klasaEnergetyczna, byte minTemperaturaChlodziarki, byte minTemperaturaZamrazarki) {
        super(nazwa, ciezar, klasaEnergetyczna);
        this.minTemperaturaChlodziarki = minTemperaturaChlodziarki;
        this.minTemperaturaZamrazarki = minTemperaturaZamrazarki;
    }

    public byte getMinTemperaturaChlodziarki() {
        return minTemperaturaChlodziarki;
    }

    public byte getMinTemperaturaZamrazarki() {
        return minTemperaturaZamrazarki;
    }

    @Override
    void opis() {
        System.out.println("Lodowka "+getNazwa());
        System.out.println("Klasa energetyczna: "+getKlasaEnergetyczna());
        System.out.println("Ciezar: "+getCiezar());
        System.out.println("Minimalna temperatura chlodziarki: "+minTemperaturaChlodziarki);
        System.out.println("Minimalna temperatura zamrazarki: "+minTemperaturaChlodziarki);
    }
}
