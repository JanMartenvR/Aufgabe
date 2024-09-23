package com.btcag.bootcamp;

import java.util.Random;
import java.util.Scanner;

public class Zahlenraten {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gebe die Zahlengröße in Bits an:");
        int bits = scanner.nextInt();
        int number = random.nextInt(bits);
        int input = 1000000;
        int x = 0;
        int y = 0;
        while (bits == 8){
            y = 255;
            bits++;
        }
        while (bits == 7){
            y = 127;
            bits++;
        }
        while (bits == 6){
            y = 63;
            bits++;
        }
        while (bits == 5){
            y = 31;
            bits++;
        }
        while (bits == 4){
            y = 15;
            bits++;
        }
        while (bits == 3){
            y = 7;
            bits++;
        }
        while (bits == 2){
            y = 3;
            bits++;
        }
        while (bits == 1){
            y = 1;
            bits++;
        }

        int i = 1;
        while (input != number) {

            System.out.println(i + ". Versuch: Bitte eine Zahl im Bereich von " + x + " bis " + y+ " eingeben:");
            input = scanner.nextInt();
            i++;

        }

    }
}
