package com.btcag.bootcamp;

import java.util.Scanner;

public class kryptischeZahlen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte die Zahl eingeben: ");
        long input = scanner.nextLong();
        System.out.println("Bitte Passwort (ZAHL) eingeben:");
        long passwort = scanner.nextLong();
        long result = 0;
        long input_var = input;
        long passwort_var = passwort;
        long multiplikator = 1;

        while (input_var != 0) {
            input_var = input % 10;
            passwort_var = passwort_var % 10;
            result = (input_var + passwort_var) % 10;
            result = result + (result * multiplikator);
            multiplikator *= 10;
            passwort_var /= 10;
            input_var /= 10;
        }

        while (input != 0) {

            result = input;
        }

        System.out.println("Result: " + result);
    }
}
