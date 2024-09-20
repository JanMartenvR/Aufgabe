package com.btcag.bootcamp;

import java.util.Scanner;

public class Supermarkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden: ");
        int summe = 0;
        int input = 1;
        while(input != 0){
            input = scanner.nextInt();
            summe += input;
        }
        int euro = summe / 100;
        int cent = summe % 100;
        System.out.println("Die Summe aller Produkte ist " + euro + " € und " + cent + " Cent.");

        System.out.println("Wieviel hat der Kunde gegeben (in Cent)? ");
        int bezahlt = scanner.nextInt();

        System.out.println("Bitte folgendes Geld zurückgeben (" + rückgeld + ")");
        System.out.println(zwh + " x 200 €");
        System.out.println(eih + " x 100 €");
        System.out.println(fuenfzige + " x 50 €");
        System.out.println(zwanzige + " x 20 €");
        System.out.println(zehne + " x 10 €");
        System.out.println(fuenfe + " x 5 €");
        System.out.println(zweie + " x 2 €");
        System.out.println(eine + " x 1 €");
        System.out.println(fuenfzigc + " x 50 Cent");
        System.out.println(zwanzigc + " x 20 Cent");
        System.out.println(zehnc + " x 10 Cent");
        System.out.println(fuenfc + " x 5 Cent");
        System.out.println(zweic + " x 2 Cent");
        System.out.println(einc + " x 1 Cent");
    }
}
