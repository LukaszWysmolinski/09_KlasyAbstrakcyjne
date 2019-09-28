package com.sdacademy.abstrakcje.agd;

//1. Dopisać nowe klasy rozszerzające klasę UrzadzenieAgd: Piekarnik, Mikrofala, Okap, do każdej z nich dodać specyficzne dla niej pola,
//zaimplemetować w każdej z nich metodę opis()

public class Main {
    public static void main(String[] args) {

        UrzadzenieAgd[] urzadzenia = {new Mikrofala("Bosh", 10, "A++", true),
                new Okap("Gorenje", 15, "A+", "1500W"),
                new Piekarnik("Samsung", 30, "A++", true, false)};


        for (UrzadzenieAgd u:urzadzenia) {
            System.out.println();
            u.opis();
        }
    }
}
