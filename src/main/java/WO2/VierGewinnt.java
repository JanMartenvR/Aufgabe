package WO2;

import java.util.Scanner;

public class VierGewinnt {

    public static void main(String[] args) {
        System.out.println("Willkommen Spieler 1!");
        String spielerEins = registrierung();
        System.out.println("Dein Name wurde als: " + spielerEins + " registriert.");

        System.out.println("Willkommen Spieler 2!");
        String spielerZwei = registrierung();
        System.out.println("Dein Name wurde als: " + spielerZwei + " registriert.");

        printBoard();

    }

    public static String registrierung() {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        while (name.length() <= 2 || name.length() >= 16) {
            System.out.print("Bitte gebe einen Namen ein (3-15 Zeichen):");
            name = scanner.nextLine();
        }
        return name;
    }
    public static void printBoard () {
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 7; x++) {
                System.out.print("( )");
            }
            System.out.println();
        }
    }
}
