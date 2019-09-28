package com.sdacademy.abstrakcje.agd.zad2;

//2. Utworzyć nowy projekt. Utworzyć klasę Ksztalt, a w niej metodę abstrakcyjną obliczPole.
//Utworzyć klasy Prostokat, Trojkat, Okrag rozszerzające klasę Ksztalt. Zaimplementować w tych klasach
//metodę obliczPole().

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj rodzaj figury:\nt - trojkat\np - prostokat\no - okrag");
        String figura = (scanner.nextLine()).toUpperCase();

        switch (figura) {
            case "T": {
                System.out.print("Podaj dlugosc podstawy: ");
                double podstawa = scanner.nextDouble();
                System.out.print("Podaj wysokosc: ");
                double wysokosc = scanner.nextDouble();
                Trojkat trojkat = new Trojkat(podstawa, wysokosc);
                System.out.println(trojkat);
                break;
            }
            case "O": {
                System.out.print("Podaj promien okregu: ");
                double promien = scanner.nextDouble();
                Okrag okrag = new Okrag(promien);
                System.out.println(okrag);
                break;
            }
            case "P": {
                System.out.print("Podaj dlugos boku A: ");
                double bokA = scanner.nextDouble();
                System.out.print("Podaj dlugos boku B: ");
                double bokB = scanner.nextDouble();
                Prostokat prostokat = new Prostokat(bokA, bokB);
                System.out.println(prostokat);
                break;
            }
            default: {
                System.out.println("Nie wybrales zadnej z figur.");

            }
        }


    }
}
