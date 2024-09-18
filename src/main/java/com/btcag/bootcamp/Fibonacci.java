package com.btcag.bootcamp;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe eine Zahl ein:");
        int max = scanner.nextInt();
        int zahl = 0;
        int zahl_alt = 0;
        System.out.println("Fibonaccizahlen bis " + max + ":");
        System.out.print(zahl+" ");
        zahl++;

        while(zahl < max){

            System.out.print(zahl+" ");
            zahl = zahl + zahl_alt;
            zahl_alt = zahl;

        }
    }
}
