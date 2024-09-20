package com.btcag.bootcamp;

import java.util.Scanner;

public class Primfaktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Zahl für den Primetest eingeben (Long):");
        long zahl = scanner.nextLong();
        long i = 2;
        while (i <= zahl){
            while (zahl % i == 0){
                System.out.print(i + " ");
                zahl /= i;
            }
            i++;
        }

    }
}
