package com.sdacademy.abstrakcje.agd;

public class Piekarnik extends UrzadzenieAgd {
    private boolean ruszt;
    private boolean termoobieg;

    public boolean isRuszt() {
        return ruszt;
    }

    public void setRuszt(boolean ruszt) {
        this.ruszt = ruszt;
    }

    public boolean isTermoobieg() {
        return termoobieg;
    }

    public void setTermoobieg(boolean termoobieg) {
        this.termoobieg = termoobieg;
    }

    public Piekarnik(String nazwa, double ciezar, String klasaEnergetyczna, boolean ruszt, boolean termoobieg) {
        super(nazwa, ciezar, klasaEnergetyczna);
        this.ruszt = ruszt;
        this.termoobieg = termoobieg;
    }

    @Override
    void opis() {
        System.out.println("Piekarnik: "+getNazwa());
        System.out.print("Funkcja rusztu: ");
        if (ruszt) {
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }
        System.out.print("Funkcja termoobieg: ");
        if (termoobieg) {
            System.out.println("Tak");
        }else{
            System.out.println("Nie");
        }

    }
}
