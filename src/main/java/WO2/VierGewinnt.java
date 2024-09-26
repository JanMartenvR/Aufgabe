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
        while (gewinnCheck()){
            spielzug(spielerEins, spielerZwei);
            printBoard();
        }

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
    public static String spielzug (String spielerEins, String spielerZwei) {
        Scanner scanner = new Scanner(System.in);
        int zug = 9999;
        int player = 1;
        String name = spielerEins;
        while (zug >= 7 || zug < 1) {
            if (player > 0) {
                name = spielerEins;
            } else {
                name = spielerZwei;
            }
            player *= -1;
            System.out.println(name + " in welche Spalte möchten Sie Ihren Spielstein platzieren?");
            zug = scanner.nextInt();
        }
    }
    public static Boolean gewinnCheck () {
        if (gewonnen) {
            return true;
        } else {
            return false;
        }
    }
}
