package com.btcag.bootcamp;

import java.util.Scanner;

public class rueckwaertsAusgeben {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine postive ganze Zahl ein:");
        String zahl = scanner.nextLine();
        String result = "";
        int length = zahl.length();

        while (length > 0){
            char c = zahl.charAt(length-1);
            result = result + c;
            length--;
        }

        System.out.println(""+result);

    }
}
