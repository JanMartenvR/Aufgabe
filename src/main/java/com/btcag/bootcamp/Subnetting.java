package com.btcag.bootcamp;

import java.util.Scanner;

public class Subnetting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe das erste Oktett der ip-Adresse an: ");
        long oktettEins = scanner.nextLong();
        System.out.println("Bitte gebe das zweite Oktett der ip-Adresse an: ");
        long oktettZwei = scanner.nextLong();
        System.out.println("Bitte gebe das dritte Oktett der ip-Adresse an: ");
        long oktettDrei = scanner.nextLong();
        System.out.println("Bitte gebe das vierte Oktett der ip-Adresse an: ");
        long oktettVier = scanner.nextLong();
        System.out.println("Bitte gebe die Subnetzmaske an: ");
        long subnetz = scanner.nextLong();


    }
}
