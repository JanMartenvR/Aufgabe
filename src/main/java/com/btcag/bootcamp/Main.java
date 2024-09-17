package com.btcag.bootcamp;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bitte Zahl eingeben zur Quadratzahlberechnung");
        Scanner scanner = new Scanner(System.in);
        long thenumber = scanner.nextLong();
        thenumber *= thenumber;
        System.out.println("Ergebnis:" + thenumber);
    }
}