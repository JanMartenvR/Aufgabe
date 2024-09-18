package com.btcag.bootcamp;

import java.util.Scanner;

public class ASCIIKunst2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Groesse einer Sanduhrhaelfte:");
        int half = scanner.nextInt();
        int i = 0;
        while (i < half){
            int h = half - 1;
            while (h >= i){
                System.out.print("*");
                h--;
            }
            System.out.println();
            i++;
        }
        i = 0;
        while (i < half){
            int h = 0;
            while (h <= i){
                System.out.print("*");
                h++;
            }
            System.out.println();
            i++;
        }
    }
}
