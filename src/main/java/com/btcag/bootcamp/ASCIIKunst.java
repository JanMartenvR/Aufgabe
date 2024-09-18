package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIKunst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Groesse des Vierecks:");
        int i = scanner.nextInt();
        int k = 0;
        while (k < i){
            int l = 0;
            while (l < i){
                System.out.print("*");
                l++;
            }
            System.out.println("");
            k++;

        }
    }
}
