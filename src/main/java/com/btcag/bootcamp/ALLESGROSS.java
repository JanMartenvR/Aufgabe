package com.btcag.bootcamp;

import java.util.Scanner;

public class ALLESGROSS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gebe ein Wort ein:");
        String wort = scanner.nextLine();
        long length = wort.length();
        int ASCII = 0;                          //-20
        while (length > 0){
            char c = wort.charAt(length-1);
            ASCII = c;
            ASCII = ASCII - 20;
            char out = (char) ASCII;
            System.out.print(out+"");
            length++;
        }


    }
}
