package com.sdacademy.abstrakcje.agd;

public class PlytaIndukcyjna extends UrzadzenieAgd {

    private int iloscPolIndukcyjnych;
    private boolean booster;

    public PlytaIndukcyjna(String nazwa, double ciezar, String klasaEnergetyczna, int iloscPolIndukcyjnych, boolean booster) {
        super(nazwa, ciezar, klasaEnergetyczna);
        this.iloscPolIndukcyjnych = iloscPolIndukcyjnych;
        this.booster = booster;
    }

    public int getIloscPolIndukcyjnych() {
        return iloscPolIndukcyjnych;
    }

    public boolean isBooster() {
        return booster;
    }

    @Override
    void opis() {
        System.out.println("Plyta indukcyjna "+getNazwa());
        System.out.println("Ilosc pol indukcyjnych: "+iloscPolIndukcyjnych);
        System.out.print("Funkcja booster :");
        if(booster){
            System.out.println("TAK");
        }
        else
        {
            System.out.println("NIE");
        }
    }
}
