package com.btcag.bootcamp;

import java.util.Scanner;

public class Pidefiniert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?");
        long i = scanner.nextLong();
        double pi = 4.0;
        int k = 0;
        double divisor = 3;
        double klammer = 1;

        while (k <= i) {
            pi = 4 * (klammer);  // Modulo benutzen um gerade und ungerade zu wechseln um +/- zu wechseln
            k++;
            while (i % 2 == 0){
                klammer = klammer - (1 / divisor);
                break;
            }
            while (i % 2 != 0){
                klammer = klammer + (1/ divisor);
                break;
            }
            divisor = divisor + 2;

        }

        System.out.println("Nach " + i + "iterationen wurde Pi  auf den Wert " + pi + "berechnet.");

    }
}
