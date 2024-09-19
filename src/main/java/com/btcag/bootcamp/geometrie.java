package com.btcag.bootcamp;

import java.util.Scanner;

public class geometrie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte ganze Zahl größer als 0 eingeben :");
        int r = scanner.nextInt();
        double area = 3.1416 * r * r;

        System.out.println(""+area);

        System.out.println("Bitte eine Seitenlänge eingeben:");
        int x = scanner.nextInt();
        System.out.println("Bitte andere Seitenlänge eingeben:");
        int y = scanner.nextInt();

        double area_square = x * y;

        System.out.println(""+area_square);

    }
}
