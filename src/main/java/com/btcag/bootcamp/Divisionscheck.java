package com.btcag.bootcamp;

import java.util.Scanner;

public class Divisionscheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcher Divisor soll geprüft werden?");
        int div = scanner.nextInt();
        System.out.println("Bis zu welcher Zahl?");
        int max = scanner.nextInt();
        int i = 0;
        int ausgabe = 0;
        while (ausgabe < (max - div)) {
            ausgabe = div * i;
            i++;
            System.out.println("" + ausgabe);
        }

    }
}
