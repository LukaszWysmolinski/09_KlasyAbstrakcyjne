package com.sdacademy.abstrakcje.agd;

public abstract class UrzadzenieAgd {
    String nazwa;
    double ciezar;
    String klasaEnergetyczna;

    public UrzadzenieAgd(String nazwa, double ciezar, String klasaEnergetyczna) {
        this.nazwa = nazwa;
        this.ciezar = ciezar;
        this.klasaEnergetyczna = klasaEnergetyczna;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCiezar() {
        return ciezar;
    }

    public String getKlasaEnergetyczna() {
        return klasaEnergetyczna;
    }

    abstract void opis();
}
