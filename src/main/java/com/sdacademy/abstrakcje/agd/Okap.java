package com.sdacademy.abstrakcje.agd;

import java.sql.SQLOutput;

public class Okap extends UrzadzenieAgd {
    private String moc;

    public String getMoc() {
        return moc;
    }

    public void setMoc(String moc) {
        this.moc = moc;
    }

    public Okap(String nazwa, double ciezar, String klasaEnergetyczna, String moc) {
        super(nazwa, ciezar, klasaEnergetyczna);
        this.moc = moc;
    }

    @Override
    void opis() {
        System.out.println("Okap: "+getNazwa());
        System.out.println("Moc: "+moc);
    }
}
