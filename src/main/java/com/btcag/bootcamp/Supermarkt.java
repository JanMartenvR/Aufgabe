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
    }
}
