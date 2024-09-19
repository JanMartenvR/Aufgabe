package com.btcag.bootcamp;

import java.util.Scanner;

public class Pidefiniert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wie viele Iterationen sollen gemacht werden um Pi zu berechnen?");
        long input = scanner.nextLong();
        double pi = 4.0;
        long i = 1;
        double divisor = 3;
        double klammer = 1;

        while (i <= input) {
            pi = 4 * (klammer);  // Modulo benutzen um gerade und ungerade zu wechseln um +/- zu wechseln
            i++;
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

        System.out.println("Nach " + input + " Iterationen wurde Pi  auf den Wert " + pi + " berechnet.");

    }
}
