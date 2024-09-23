package com.btcag.bootcamp;

import java.util.Scanner;

public class Supermarkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte alle Produkte in Cent eingeben und mit 0 die Liste beenden: ");
        int summe = 0;
        int input = 1;
        while (input != 0) {
            input = scanner.nextInt();
            summe += input;
        }
        int euro = summe / 100;
        int cent = summe % 100;
        System.out.println("Die Summe aller Produkte ist " + euro + " € und " + cent + " Cent.");

        System.out.println("Wieviel hat der Kunde gegeben (in Cent)? ");
        String bezahlt = scanner.nextLine();
        int lenght = bezahlt.length();
        int rueckgeld = 0;
        int zwh = 0;
        int eih = 0;
        int fuenfzige = 0;
        int zwanzige = 0;
        int zehne = 0;
        int fuenfe = 0;
        int zweie = 0;
        int eine = 0;
        int fuenfzigc = 0;
        int zwanzigc = 0;
        int zehnc = 0;
        int fuenfc = 0;
        int zweic = 0;
        int einc = 0;
        while (summe != 0) {



                //vll lieber String input und den zerlegen, dann kann aus der länge direkt hunderter rausgesucht werden.
//            while (length > 0){
//            char c = zahl.charAt(length-1);
//            result = result + c;
//            length--;
//        }

        }

        System.out.println("Bitte folgendes Geld zurückgeben (" + rueckgeld + ")");
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
