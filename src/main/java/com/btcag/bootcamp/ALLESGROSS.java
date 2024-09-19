package com.btcag.bootcamp;

import java.util.Scanner;

public class ALLESGROSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie ein Wort ein:");
        String wort = scanner.nextLine();
        int length = wort.length();
        int ASCII = 0;
        int i = 0;
        while (length > i){
            char c = wort.charAt(i);
            ASCII = c;
            ASCII = ASCII - 32;
            char out = (char) ASCII;
            System.out.print(out+"");
            i++;
        }
    }
}
