package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe eine Zahl ein:");
        int max = scanner.nextInt();
        int zahl_alt = 0;
        int zahl = 1;
        System.out.println("Fibonaccizahlen bis " + max + ":");
        System.out.print(zahl_alt+" ");

        while(zahl <= max){

            System.out.print(zahl+" ");
            int zahl_aelter = zahl_alt + zahl;
            zahl_alt = zahl;
            zahl = zahl_aelter;

        }
    }
}
